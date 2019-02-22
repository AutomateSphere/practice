package main;

import pojo.Employee;
import service.EmployeeService;
import dao.EmployeeDao;
import dao.EmployeeDaoImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeService ed=new EmployeeService();
		Employee emp=new Employee("Amit",45, 67000, "87655");
		String res=ed.createEmployee(emp);
		System.out.println(res);

	}

}
