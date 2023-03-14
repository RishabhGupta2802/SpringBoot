package com.rg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rg.dao.IEmployeeDAO;
import com.rg.model.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	@Qualifier("finalDAO")
	private IEmployeeDAO empDAO;
	
	@Override
	public String registerEmployee(Employee emp)throws Exception{
	//calculate gross salary and netSalary
	double grossSalary=emp.getSalary()+(emp.getSalary()*0.4f);
	double netSalary=grossSalary-(grossSalary*0.2f);
	//set grossSalary and netSalary to employee obj
	emp.setGrossSalary(grossSalary);
	emp.setNetSalary(netSalary);
	//use DAO
	int count=empDAO.insert(emp);
	
	return count==0?"Employee registration failed":"Employee register and the  salary="+emp.getSalary()+"--grossSalary=="+emp.getGrossSalary()+"--netSalary=="+emp.getNetSalary();
	}
	
}
