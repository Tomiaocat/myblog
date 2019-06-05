package cn.tomiaocat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MyTimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyTimeApplication.class, args);
	}
}
