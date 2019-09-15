package com.denizturkmen.Service;

import com.denizturkmen.Entity.Employee;

public interface EmployeeService {

	//Dao katmanındaki verileri almak için
	public abstract void createEmployee(Employee employee);

	public abstract Employee getEmployeebyId(int employeeId);

	public abstract void updateEmployeeById(int employeeId, Double newSal);

	public abstract void deleteEmployeeById(Integer employeeId);

}
