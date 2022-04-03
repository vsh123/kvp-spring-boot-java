package kvp.van.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VanTestController {

    @GetMapping("van")
    public String get() {
        return "van";
    }

    @GetMapping("van/error")
    public void errorGet() {
        throw new RuntimeException("에러입니다.");
    }


//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public @ResponseBody String error(Exception e) {
//        return e.getMessage();
//    }
}
