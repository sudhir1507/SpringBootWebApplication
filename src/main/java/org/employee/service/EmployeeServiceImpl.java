package org.employee.service;

import java.util.List;
import java.util.Optional;

import org.employee.model.Employee;
import org.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository empRepo;

	@Override
	public boolean isAddNewEmployee(Employee employee) {
		Employee emp = empRepo.save(employee);
		return emp != null ? true : false;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> emp = empRepo.findAll();
		return emp;
	}

	@Override
	public boolean deleteEmployeeById(int id) {
//	   Optional<Employee> emp=empRepo.findById(id);
//	   if(emp.isEmpty()) {
//		   return false;
//	   }else {
		empRepo.deleteById(id);
		return true;
		// }

	}

	@Override
	public boolean updateEmployeeById(Employee employee) {
		Employee e = empRepo.save(employee);
		return e != null ? true : false;
	}

//	@Override
//	public boolean updateEmployeeById1(Integer Id) {
//        
//		return false;
//	}

}
