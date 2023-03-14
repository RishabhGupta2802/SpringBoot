package com.rg;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.rg.controller.PayrollOperationController;
import com.rg.model.Employee;

@SpringBootApplication
@ImportResource("com/rg/cfgs/applicationContext.xml")
public class SbProj03LayeredAppRealtimeDiApplication {
	
	public static void main(String[] args) {
		
		//read input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name::");
		String name=sc.next();
		System.out.println("Enter employee desg::");
		String desg=sc.next();
		System.out.println("Enter employee basicSalary::");
		double basicSalary=sc.nextDouble();
		//create the emp obj
		Employee emp=new Employee();
		emp.setDesg(desg);
		emp.setEname(name);
		emp.setSalary(basicSalary);
		
		//get IOC container
		ApplicationContext ctx= SpringApplication.run(SbProj03LayeredAppRealtimeDiApplication.class,args);
		//get controller class object
		PayrollOperationController controller=ctx.getBean("payrollController",PayrollOperationController.class);
		//invoke the method
		try {
			String result=controller.processEmployee(emp);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("internal problem--> Try again"+e.getMessage());
		}
		//close container
		((ConfigurableApplicationContext)ctx).close();
		
	   
	}

}

