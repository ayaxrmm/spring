package spring.aya.practice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import spring.aya.practice2.config.GreetingProperties;
import spring.aya.practice2.config.InfoProperties;


@EnableConfigurationProperties({GreetingProperties.class, InfoProperties.class})

@SpringBootApplication
public class Practice2Application {

	public static void main(String[] args) {
		SpringApplication.run(Practice2Application.class, args);
	}

}

