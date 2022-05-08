package kvp.van.springboot.controller;

import static java.lang.Thread.sleep;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {
    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        sleep(5000L);
        return "hello";
    }

    @GetMapping("/hi")
    public String hi() throws InterruptedException {
        sleep(3000L);
        return "hi";
    }
}
