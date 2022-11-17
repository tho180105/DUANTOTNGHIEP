package store.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@SpringBootApplication
@EnableScheduling
public class DuAnTotNghiepApplication {
	public static void main(String[] args) {
		SpringApplication.run(DuAnTotNghiepApplication.class, args);
	}

}
