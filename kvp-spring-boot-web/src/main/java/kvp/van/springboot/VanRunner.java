package kvp.van.springboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class VanRunner implements ApplicationRunner {
    private final Van van;

    public VanRunner(Van van) {
        this.van = van;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(van);
    }
}
