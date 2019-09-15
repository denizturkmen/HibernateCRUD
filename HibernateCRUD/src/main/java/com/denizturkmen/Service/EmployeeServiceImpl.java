package com.denizturkmen.Service;

import com.denizturkmen.DAO.EmployeeDAOImpl;
import com.denizturkmen.Entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void createEmployee(Employee employee) {

		// veritabanı kaydetme işlemini DAO katmanında yaptım sadece yaratıp yolluycam
		new EmployeeDAOImpl().addEmployee(employee);
	}

	@Override
	public Employee getEmployeebyId(int employeeId) {

		return new EmployeeDAOImpl().fetchEmployeebyId(employeeId);

	}

	@Override
	public void updateEmployeeById(int employeeId, Double newSal) {

		new EmployeeDAOImpl().updateEmployeeById(employeeId, newSal);
	}

	@Override
	public void deleteEmployeeById(Integer employeeId) {

		new EmployeeDAOImpl().deleteEmployeeById(employeeId);

	}

}
