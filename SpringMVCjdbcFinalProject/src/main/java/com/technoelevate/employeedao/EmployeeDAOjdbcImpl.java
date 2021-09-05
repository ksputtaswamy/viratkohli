package com.technoelevate.employeedao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.technoelevate.employeedto.EmployeeDTO;
import com.technoelevate.employeerowmapper.EmployeerowMapper;
@Component
public class EmployeeDAOjdbcImpl implements EmployeeDAO {
	
	EmployeeDTO dto;
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int addEmp(EmployeeDTO dto) {
		String query="INSERT INTO employeespring VALUES(?,?,?)";
		int result=template.update(query,dto.getEmpId(),dto.getUser(),dto.getPassword());
		return result;
	}

	
	public EmployeeDTO authentication(int empId, String password) {
		String query="SELECT * FROM employeespring WHERE password=?";  
		RowMapper<EmployeeDTO> rowMapper=new EmployeerowMapper();
	EmployeeDTO dto=template.queryForObject(query,rowMapper,password);
		return dto;
	}

	public EmployeeDTO getEmp(int empId) {
	
		return null;
	}

	@Override
	public boolean deleteEmp(int empId) {
	
		return false;
	}

	@Override
	public List<EmployeeDTO> getAllEmp() {
	
		return null;
	}


}
