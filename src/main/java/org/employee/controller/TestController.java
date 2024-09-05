package org.employee.controller;

import java.util.List;
import java.util.Optional;

import org.employee.model.Employee;
import org.employee.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TestController {
	@Autowired
	@Qualifier("empService")
	EmployeeServiceImpl empService;

	@PostMapping("/save")
	public String isAddNewEmployee(@RequestBody Employee employee) {
		boolean b = empService.isAddNewEmployee(employee);
		if (b) {
			return "Employee added success..";
		} else {
			return "Employee Not added";
		}
	}

	@GetMapping("/viewemp")
	public List<Employee> getAllEmployee() {
		return empService.getAllEmployee();
	}

	@GetMapping("/delemp/{id}")
	public String deleteEmployee(@PathVariable("id") Integer id) {
		boolean b = empService.deleteEmployeeById(id);
		return b ? "Employee deleted" : "Employee Not Found";

	}

	
	 @PutMapping("/updateemp") 
	 public String updateEmployee(@RequestBody Employee employee) 
	 { boolean b=empService.updateEmployeeById(employee);
	  return b?"Employee Data updated":"Employee NOT Updated";
	  
	  }
	 
//	@PutMapping("/updateemp")
//	public String updateEmployee(@RequestBody Employee employee) {
//		boolean b = empService.updateEmployeeById1(employee);
//		return b ? "Employee Data updated" : "Employee NOT Updated";
//
//	}
}
