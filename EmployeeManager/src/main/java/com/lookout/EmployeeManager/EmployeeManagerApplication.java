package com.lookout.EmployeeManager;

import com.lookout.EmployeeManager.services.EmployeeService;
import com.lookout.EmployeeManager.domain.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class EmployeeManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagerApplication.class, args);



//		ApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeManagerApplication.class);
	//		Employee e1 = new Employee(1,"Donald Trump","Janitor", 100);
//		Employee e2 = new Employee(2,"Steve Jobs", "Electrician", 500);
//		Employee e3 = new Employee(3, "Raju Pohewala", "Senior Manager", 10000);
//		Employee e4 = new Employee(4, "Mukesh Khastani", "Software Engineer", 3000);


	}

}
