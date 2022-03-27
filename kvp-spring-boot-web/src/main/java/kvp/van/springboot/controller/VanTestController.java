package kvp.van.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VanTestController {

    @GetMapping("van")
    public String get() {
        return "van";
    }
}
