package com.accenture;

import com.accenture.exception.ResourceNotFoundException;
import com.accenture.model.Employee;
import com.accenture.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Demo106Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Demo106Application.class, args);


	}


	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstname("Yash");
		employee.setLastname("Ambolkar");
		employee.setEmail("yash@accenture.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstname("Y");
		employee1.setLastname("A");
		employee1.setEmail("y@accenture.com");
		employeeRepository.save(employee1);
	}

}

