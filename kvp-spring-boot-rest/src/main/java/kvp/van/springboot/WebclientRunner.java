package kvp.van.springboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class WebclientRunner implements ApplicationRunner {
    private final WebClient.Builder webClientBuilder;

    public WebclientRunner(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        WebClient webClient = webClientBuilder.build();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Mono<String> helloResult = webClient.get().uri("/hello")
            .retrieve()
            .bodyToMono(String.class);
        helloResult.subscribe(it -> {
            System.out.println(it);

            if (stopWatch.isRunning()) {
                stopWatch.stop();
            }
            System.out.println(stopWatch.prettyPrint());
            stopWatch.start();
        });

        Mono<String> hiResult = webClient.get().uri("/hi")
            .retrieve()
            .bodyToMono(String.class);
        hiResult.subscribe(it -> {
            System.out.println(it);

            if (stopWatch.isRunning()) {
                stopWatch.stop();
            }
            System.out.println(stopWatch.prettyPrint());
            stopWatch.start();
        });

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }
}
