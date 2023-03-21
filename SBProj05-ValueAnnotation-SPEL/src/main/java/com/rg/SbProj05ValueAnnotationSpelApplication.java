package com.rg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rg.sbeans.Hotel;

@SpringBootApplication
public class SbProj05ValueAnnotationSpelApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(SbProj05ValueAnnotationSpelApplication.class, args);
		
		//get hotel class obj ref
		Hotel hotel=ctx.getBean("hotel", Hotel.class);
		System.out.println(hotel);
		//close the IOC container
		((ConfigurableApplicationContext)ctx).close();
	} 

}
