package kvp.van.springboot;

import kvp.van.springboot.eventlistener.SampleListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		final SpringApplication springApplication = new SpringApplication(SpringbootApplication.class);
		springApplication.addListeners(new SampleListener()); //Listener를 직접 등록
		springApplication.run(args);
	}
}
