package kvp.van.springboot;

import kvp.van.springboot.account.AccountService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {
    private final AccountService accountService;

    public AccountRunner(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        accountService.save("van", "van");
    }
}
