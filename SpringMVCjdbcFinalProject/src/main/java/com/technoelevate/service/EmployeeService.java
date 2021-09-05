package com.technoelevate.service;

import java.util.List;

import com.technoelevate.employeedto.EmployeeDTO;

public interface EmployeeService  {
	public int addEmp(EmployeeDTO dto);
	public EmployeeDTO authentication(int empId,String password);
	
	public boolean deleteEmp(int empId);
	
	public List<EmployeeDTO> getAllEmp();
	

}
