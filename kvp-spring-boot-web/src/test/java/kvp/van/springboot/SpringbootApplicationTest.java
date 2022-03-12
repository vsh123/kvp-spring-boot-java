package kvp.van.springboot;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
class SpringbootApplicationTest {
    @Autowired
    private Environment environment;

    @Test
    void 외부_설정_테스트() {
        String actual = environment.getProperty("van.name");

        assertThat(actual).isEqualTo("sunho-test");
    }
}