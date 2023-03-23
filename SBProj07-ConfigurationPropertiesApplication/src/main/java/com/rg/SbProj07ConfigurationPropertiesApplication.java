package com.rg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rg.sbeans.Company;

@SpringBootApplication
public class SbProj07ConfigurationPropertiesApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(SbProj07ConfigurationPropertiesApplication.class, args);
		//get company class obj ref
		Company com=ctx.getBean("comp", Company.class);
		System.out.println(com);
		
		//close container
		((ConfigurableApplicationContext)ctx).close();
	}

}
