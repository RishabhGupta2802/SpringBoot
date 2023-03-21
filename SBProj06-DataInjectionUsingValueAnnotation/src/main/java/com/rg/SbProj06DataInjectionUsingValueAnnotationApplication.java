package com.rg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rg.sbeans.PatientInfo;

@SpringBootApplication
public class SbProj06DataInjectionUsingValueAnnotationApplication {

	public static void main(String[] args) {
		//get IOC Container 
		ApplicationContext ctx=SpringApplication.run(SbProj06DataInjectionUsingValueAnnotationApplication.class, args);
		//get Patientinfo Spring bean class object 
		PatientInfo info=ctx.getBean("pinfo",PatientInfo.class);
		System.out.println(info);
		
		//close the IOC container
		((ConfigurableApplicationContext)ctx).close();
	}

}
