package org.employee.service;

import java.util.List;

import org.employee.model.Employee;

public interface EmployeeService {
	public boolean isAddNewEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public boolean deleteEmployeeById(int id);
	public boolean updateEmployeeById(Employee employee);
	//public boolean updateEmployeeById1(Integer Id);
	
	
}
