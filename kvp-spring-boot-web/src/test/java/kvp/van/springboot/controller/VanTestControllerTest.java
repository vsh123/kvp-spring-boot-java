package kvp.van.springboot.controller;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class VanTestControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private WebTestClient webClient;

    @Test
    void restTemplateTest() {
        String result = restTemplate.getForObject("/van", String.class);

        assertThat(result).isEqualTo("van");
    }

    @Test
    void webTestClientTest() {
        webClient.get().uri("/van")
            .exchange()
            .expectStatus().isOk()
            .expectBody(String.class)
            .isEqualTo("van");
    }
}