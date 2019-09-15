package com.denizturkmen.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.denizturkmen.Entity.Employee;
import com.denizturkmen.Util.HibernateUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void addEmployee(Employee employee) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.beginTransaction();

			session.save(employee);
			Integer id = (Integer) session.save(employee);
			System.out.println("Employee is created id:::" + id);

			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Employee fetchEmployeebyId(int id) {
		Employee employee = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// get ile veritabanında id olan var mı die bakıyoruz
			employee = session.get(Employee.class, id);
			if (employee != null) {
				return employee;
			} else {
				System.out.println("Böyle id bir employee yok");
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void updateEmployeeById(int employeeId, Double newSalary) {

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Employee employee = session.get(Employee.class, employeeId);
			if (employee != null) {
				employee.setSalary(newSalary);
				session.beginTransaction();
				session.update(employee);
				session.getTransaction().commit();
			} else {
				System.out.println("Employee doesn't exist with provideded ID...");
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteEmployeeById(Integer employeeId) {
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			Employee employee = session.get(Employee.class, employeeId);
			if(employee != null) {
				session.beginTransaction();
				session.delete(employee);
				session.getTransaction().commit();
			}
			else {
				System.out.println("Böyle id li bir Employee yoookkk....");
			}
		}

	}

}
