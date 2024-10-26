package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Company;

@SpringBootApplication
public class Bootproj04ConfigurationPropertiesBulkInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=
		SpringApplication.run(Bootproj04ConfigurationPropertiesBulkInjectionApplication.class, args);
		
		Company cp=ctx.getBean("comp",Company.class);
		System.out.println(cp);
	}

}
