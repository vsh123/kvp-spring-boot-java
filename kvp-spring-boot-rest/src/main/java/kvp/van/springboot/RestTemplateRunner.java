package kvp.van.springboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateRunner implements ApplicationRunner {
    private final RestTemplateBuilder restTemplateBuilder;

    public RestTemplateRunner(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        RestTemplate restTemplate = restTemplateBuilder.build();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        String result = restTemplate.getForObject("http://localhost:8080/hello", String.class);
        System.out.println(result);

        String hi = restTemplate.getForObject("http://localhost:8080/hi", String.class);
        System.out.println(hi);

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }
}
