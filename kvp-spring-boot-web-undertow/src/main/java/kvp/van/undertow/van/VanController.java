package kvp.van.undertow.van;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
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

    @GetMapping("hateoas")
    public EntityModel<Hateoas> hateoas() {
        Hateoas hateoas = new Hateoas("prefix", "name");
        return EntityModel.of(hateoas, Link.of("hateoas"));
    }

//    @CrossOrigin(origins = "http://localhost:18081")
    @GetMapping("cors")
    public String cors() {
        return "cors";
    }

    @PostMapping("/users/create")
    @ResponseStatus(HttpStatus.CREATED)
    public User user(@RequestBody User user) {
        userLogger.info("createUser {}", user);
        return user;
    }
}
