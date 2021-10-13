package com.EmployeeAdministration;

import com.EmployeeAdministration.Dto.EmployeeDTO;
import com.EmployeeAdministration.Service.EmployeeServiceImpl;
import com.EmployeeAdministration.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeAdministrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeAdministrationApplication.class, args);
	}

	@Autowired
	private EmployeeServiceImpl employeeService;

	@Bean
	public CommandLineRunner initDB() {
		return (args) -> {
			this.employeeService.save(new EmployeeDTO(1L,"Aiswarya", "9647737738", "Kerala"));
			this.employeeService.save(new EmployeeDTO(2L,"Sonia", "8952641576", "Karnataka"));
		};
	}
}
