package com.lookout.EmployeeManager.controllers;

import com.lookout.EmployeeManager.annotations.Metric;
import com.lookout.EmployeeManager.domain.Employee;
import com.lookout.EmployeeManager.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:3002")
@RestController
@RequestMapping("api/v1")
public class EmployeeRestController {
    @Autowired
    private EmployeeService employeeService;

    @Metric
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }

    @Metric
    @GetMapping("/employees/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable(value = "id") Long id) {
        return employeeService.getEmployeeById(id);
    }

    @Metric
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
}
