package kvp.van.springboot.account;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.persistence.EntityNotFoundException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;

@DataJpaTest
class AccountRepositoryTest {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private AccountRepository accountRepository;

    @Test
    void accountTest() {
        Account account = new Account("van", "van");
        accountRepository.save(account);

        assertThat(account.getId()).isNotNull();

        Account user = accountRepository.findByUsername("van")
            .orElseThrow(() -> new EntityNotFoundException("없음~"));

        assertThat(account).isEqualTo(user);
    }
}