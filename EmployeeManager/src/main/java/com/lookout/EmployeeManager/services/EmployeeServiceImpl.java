package com.lookout.EmployeeManager.services;

import com.lookout.EmployeeManager.domain.Employee;
import com.lookout.EmployeeManager.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employeesList = (List<Employee>) employeeRepository.findAll();
        List<Employee> employees = employeesList
                .stream()
                .map(emp -> new Employee(
                        emp.getId(),
                        emp.getName(),
                        emp.getDesignation(),
                        emp.getSalary()
                )).collect(Collectors.toList());
        return employees;
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
