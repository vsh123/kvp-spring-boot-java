package kvp.van.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class VanRunner implements ApplicationRunner {
    private final Van van;

    private Logger logger = LoggerFactory.getLogger("aaaaaa");

    public VanRunner(Van van) {
        this.van = van;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.debug("hello dubug Van!");
        System.out.println(van);
    }
}
