package com.rg;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.rg.sbeans.SeasonFinder;

@SpringBootApplication
public class SbProj01DependencyInjectionApplication {
	
	@Bean(name="ld")
	public LocalDate createDate() {
		return LocalDate.now();
	}

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SbProj01DependencyInjectionApplication.class, args);
		//get Target Spring Bean class obj
		SeasonFinder finder=ctx.getBean("sf", SeasonFinder.class);
		//invoke the b.method
		String seasonName=finder.findSeason();
		System.out.println("Season Name::"+seasonName);
		
		//close the IOC Container
		((ConfigurableApplicationContext)ctx).close();
	}

}
