package com.lookout.EmployeeManager.repositories;

import com.lookout.EmployeeManager.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
