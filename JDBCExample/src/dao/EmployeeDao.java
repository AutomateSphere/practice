package dao;

import java.util.List;

import pojo.Employee;

public interface EmployeeDao {
	public String createEmployee(Employee e);
	public Employee getEmployeeByID(String eid);
	public List<Employee> getAllEmployee();
	public String deleteEmployee(String eid);
}
