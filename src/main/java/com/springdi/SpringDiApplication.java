package com.springdi;

import com.springdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(SpringDiApplication.class, args);

		MyController controller = run.getBean(MyController.class);

		System.out.println("In Main Method");

		System.out.println(controller.sayHello());
	}

}
