package com.rg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rg.sbeans.Vehicle;

@SpringBootApplication
public class SbProj02StrategyDpApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(SbProj02StrategyDpApplication.class, args);
		//get target Spring Beans class object
		Vehicle vehicle=ctx.getBean("vehicle", Vehicle.class);
		//Invoke the b.method
		vehicle.move("hyderbad", "Goa");
		
		//close container
		((ConfigurableApplicationContext)ctx).close();
	}

}
