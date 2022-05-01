package kvp.van.springboot;

import kvp.van.springboot.account.Account;
import kvp.van.springboot.account.AccountRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {
    private final AccountRepository accountRepository;

    public AccountRunner(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        accountRepository.save(new Account("van", "van"));
    }
}
