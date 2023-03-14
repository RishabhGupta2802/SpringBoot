package com.rg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rg.model.Employee;
import com.rg.service.IEmployeeMgmtService;

@Controller("payrollController")
public class PayrollOperationController {
    @Autowired
	private IEmployeeMgmtService service;
    
    public String processEmployee(Employee emp)throws Exception{
    //delegate the request to service class
    	String result =service.registerEmployee(emp);
    	return result;
    }
}
