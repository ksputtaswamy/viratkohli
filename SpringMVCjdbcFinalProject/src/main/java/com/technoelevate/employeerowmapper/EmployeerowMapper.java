package com.technoelevate.employeerowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.technoelevate.employeedto.EmployeeDTO;

public class EmployeerowMapper implements RowMapper<EmployeeDTO> {
	
   EmployeeDTO dto= new EmployeeDTO();
	@Override
	public EmployeeDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		dto.setEmpId(rs.getInt(1));
		dto.setUser(rs.getString(2));
		dto.setPassword(rs.getString(3));
		return dto;
	}

}
