package kvp.van.springboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VanConfiguration {
    @Bean
    @ConfigurationProperties("van")
    @ConditionalOnMissingBean
    public Van van() {
        return new Van();
    }
}
