package com.lookout.EmployeeManager.services;

import com.lookout.EmployeeManager.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {

    public List<Employee> findAll();
    public Optional<Employee> getEmployeeById(Long id);
    public Employee addEmployee(Employee employee);

//    public void addEmployee(Employee employee);
//    public Employee getEmployeeById(int id);
//    public Collection<Employee> getAllEmployees();
//    public void updateEmployee(Employee employee, int id);
//    public void deleteEmployee(int id);
// public Employee setEmployee(int id, String name, String designation, double salary);
}
