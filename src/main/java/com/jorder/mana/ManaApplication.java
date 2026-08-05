package com.jorder.mana;

import org.springdoc.core.configuration.SpringDocDataRestConfiguration;
import org.springdoc.core.configuration.SpringDocHateoasConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//		(exclude = {
//		SpringDocHateoasConfiguration.class,
//		SpringDocDataRestConfiguration.class
//})
public class ManaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManaApplication.class, args);
	}

}
