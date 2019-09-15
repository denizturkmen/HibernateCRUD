package com.denizturkmen.DAO;

import com.denizturkmen.Entity.Employee;

public interface EmployeeDAO {
	
	//eklemek için soyut metot
	public abstract void addEmployee(Employee employee);
	
	public abstract Employee fetchEmployeebyId(int id);
	
	//id göre maaş update edecez
	public abstract void updateEmployeeById(int employeeId,Double newSalary);
	
	public abstract void deleteEmployeeById(Integer employeeId);
	
}
