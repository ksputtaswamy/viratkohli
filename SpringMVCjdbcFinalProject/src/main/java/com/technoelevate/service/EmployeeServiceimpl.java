package com.technoelevate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.technoelevate.employeedao.EmployeeDAO;
import com.technoelevate.employeedao.EmployeeDAOjdbcImpl;
import com.technoelevate.employeedto.EmployeeDTO;
@Component
public class EmployeeServiceimpl implements EmployeeService{

	ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
	EmployeeDAOjdbcImpl emp=context.getBean("EmployeeDao",EmployeeDAOjdbcImpl.class);
//	@Autowired
//	EmployeeDAOjdbcImpl dao;
	@Override
public int addEmp(EmployeeDTO dto) {
		
		return  emp.addEmp(dto);
	}
	@Override
	public EmployeeDTO authentication(int empId, String password) {
	
	
		return emp.authentication(empId,password);
	}

	@Override
	public boolean deleteEmp(int empId) {
		if(empId<=0) {
			return false;
		}else {
			return emp.deleteEmp(empId);
		}
	
	}

	

	@Override
	public List<EmployeeDTO> getAllEmp() {
		
		return emp.getAllEmp();
	}

}
