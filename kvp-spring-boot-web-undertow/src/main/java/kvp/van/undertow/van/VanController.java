package kvp.van.undertow.van;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VanController {
    private Logger userLogger = LoggerFactory.getLogger("kvp.van.user");

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/users/create")
    @ResponseStatus(HttpStatus.CREATED)
    public User user(@RequestBody User user) {
        userLogger.info("createUser {}", user);
        return user;
    }
}
