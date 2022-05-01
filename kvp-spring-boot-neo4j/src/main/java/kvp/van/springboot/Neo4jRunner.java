package kvp.van.springboot;

import kvp.van.springboot.account.Account;
import kvp.van.springboot.account.AccountRepository;
import kvp.van.springboot.account.Role;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Neo4jRunner implements ApplicationRunner {
    private final AccountRepository accountRepository;

    public Neo4jRunner(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = new Account("van", "van");
        account.addRole(new Role("aa"));
        accountRepository.save(account);
    }
}
