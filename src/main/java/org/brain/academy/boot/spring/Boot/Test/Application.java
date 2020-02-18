package org.brain.academy.boot.spring.Boot.Test;

import lombok.extern.slf4j.Slf4j;
import org.brain.academy.boot.spring.Boot.Test.beans.CarBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;

@SpringBootApplication
//@ComponentScan(basePackages = "org.brain.academy.boot.spring.Boot.Test.beans")
@Slf4j
public class Application {

	@Autowired
	private CarBean carBean;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@EventListener(ApplicationReadyEvent.class)
	public void run(){
		log.info("All init");
		carBean.getTaxiService().callTaxi("John");
	}

}
