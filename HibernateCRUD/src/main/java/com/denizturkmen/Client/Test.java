package com.denizturkmen.Client;

import java.util.Date;

import com.denizturkmen.Entity.Employee;
import com.denizturkmen.Service.EmployeeService;
import com.denizturkmen.Service.EmployeeServiceImpl;

public class Test {
	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeServiceImpl();
		 createEmployee(employeeService);
		 //getEmployeeById(employeeService);
		 //updateEmployeeById(employeeService);
		// deleteEmployeeById(employeeService);
		
	}

	private static void deleteEmployeeById(EmployeeService employeeService) {

		employeeService.deleteEmployeeById(1);

	}

	private static void updateEmployeeById(EmployeeService employeeService) {

		employeeService.updateEmployeeById(1, 4432.0);

	}

	private static void getEmployeeById(EmployeeService employeeService) {

		Employee employee = employeeService.getEmployeebyId(1);
		System.out.println(employee);

	}

	private static void createEmployee(EmployeeService employeeService) {
		employeeService.createEmployee(getEmployee());
	}

	private static Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeName("Deniz Türkmen");
		employee.setEmail("turkmens_deniz@hotmail.com");
		employee.setSalary(15000.0);
		employee.setDoj(new Date());

		return employee;
	}

}
