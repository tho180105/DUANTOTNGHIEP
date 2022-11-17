package store.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import store.com.RestController.CartRestController;

//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@SpringBootApplication
public class DuAnTotNghiepApplication {
	public static void main(String[] args) {

 	SpringApplication.run(DuAnTotNghiepApplication.class, args);

	}

}
