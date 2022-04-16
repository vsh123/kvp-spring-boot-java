package kvp.van.springboot;

import kvp.van.springboot.account.AccountHash;
import kvp.van.springboot.account.AccountHashRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RedisRunner implements ApplicationRunner {
    private final StringRedisTemplate redisTemplate;
    private final AccountHashRepository accountHashRepository;

    public RedisRunner(StringRedisTemplate redisTemplate,
                       AccountHashRepository accountHashRepository) {
        this.redisTemplate = redisTemplate;
        this.accountHashRepository = accountHashRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ValueOperations<String, String> values = redisTemplate.opsForValue();

        values.set("van", "sunho");
        values.set("1", "2");
        values.set("3", "4");

        AccountHash accountHash = new AccountHash();
        accountHash.setUsername("van");
        accountHash.setEmail("vsh123");

        accountHashRepository.save(accountHash);

        AccountHash user = accountHashRepository.findById(accountHash.getId()).get();
        System.out.println(user.getUsername());
        System.out.println(user.getEmail());

    }
}
