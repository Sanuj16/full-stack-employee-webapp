package com.lookout.EmployeeManager.bootstrap;

import com.lookout.EmployeeManager.domain.Employee;
import com.lookout.EmployeeManager.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    @Autowired
    private final EmployeeRepository employeeRepository;

    public BootstrapData(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Employee e1 = new Employee(1L,"Donald Trump","Janitor", 100);
		Employee e2 = new Employee(2L,"Steve Jobs", "Electrician", 500);
		Employee e3 = new Employee(3L, "Raju Pohewala", "Senior Manager", 10000);
		Employee e4 = new Employee(4L, "Mukesh Khastani", "Software Engineer", 3000);
        employeeRepository.save(e1);
        employeeRepository.save(e2);
        employeeRepository.save(e3);
        employeeRepository.save(e4);



    }
}
