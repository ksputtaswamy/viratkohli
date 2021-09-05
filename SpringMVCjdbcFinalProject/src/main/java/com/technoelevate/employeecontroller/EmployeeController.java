package com.technoelevate.employeecontroller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.technoelevate.employeedao.EmployeeDAOjdbcImpl;
import com.technoelevate.employeedto.EmployeeDTO;
import com.technoelevate.service.EmployeeServiceimpl;
@ComponentScan({"com.technoelevate.employeedao","com.technoelevate.employeedto","com.technoelevate.service"})
@Controller
public class EmployeeController {
	@Autowired
	EmployeeServiceimpl service;
	
	
	@GetMapping("/login")
	public String getEmpFofm() {
		return "Login";
	}
	@PostMapping("/authenticate")
	public String  authenticate(ModelMap map,EmployeeDTO dto) {
		if( service.authentication(dto.getEmpId(),dto.getPassword()) != null) {
			map.addAttribute("emps", dto);
			map.addAttribute("msg", "login successful");
		}
		else {
			map.addAttribute("msg", "login failed due to wrong credential");
		}
		return "Homepage";
	}
	@GetMapping("/add")
	public String addEmp() {
		
		return "InsertEmp";
	}
	@PostMapping("/insrt")
	public String insertEmp(ModelMap map,EmployeeDTO dto) {
		
		if(dto!=null) {
			service.addEmp( dto);
			map.addAttribute("AddEmp", dto);
			
			map.addAttribute("msg", "inserted successfully");
		}else {
			map.addAttribute("msg", "insertion failed due to wrong credential");
			
		}
    	return "InsertedHome";
	
	}
	public String getAllHeros(ModelMap map, EmployeeDTO dto) {
	java.util.List<EmployeeDTO> allemp = service.getAllEmp();
		map.addAttribute("my_Message", "Hello employees");
		map.addAttribute("All_emp", allemp);
		return "AllEmployee";
	}
	@GetMapping("/delete")
	public String getEmp() {
		
		return "Deletepage";
	}
	@GetMapping("/logout")
	public String logout(HttpSession session,ModelMap map) {
		map.addAttribute("msg", "logout successful");
		session.invalidate();
		
		return "logout";
	}
	
}

