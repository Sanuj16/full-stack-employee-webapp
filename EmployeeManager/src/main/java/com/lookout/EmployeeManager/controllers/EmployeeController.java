package com.lookout.EmployeeManager.controllers;

import com.lookout.EmployeeManager.annotations.Metric;
import com.lookout.EmployeeManager.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Metric
    @RequestMapping("/")
    public String getHomepage(Model model) {
        model.addAttribute("home", "Employees List");
        return "home";
    }
    @Metric
    @RequestMapping("/employees")
    public String getAllEmployees(Model model) {
        model.addAttribute("employees", employeeService.findAll());
        return "employees";
    }
}
