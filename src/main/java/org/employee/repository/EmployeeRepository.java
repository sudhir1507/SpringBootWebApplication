package org.employee.repository;

import org.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("empRepo")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
