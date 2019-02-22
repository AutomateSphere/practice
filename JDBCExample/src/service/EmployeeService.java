package service;

import java.util.List;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import pojo.Employee;

public class EmployeeService {
	EmployeeDao edao=new EmployeeDaoImpl();
	public String createEmployee(Employee e) {
		if(e.getName().length()>2 && e.getAge()>18){
			String rand=((Double)Math.random()).toString();
			String id=e.getName().substring(0,2)+rand.substring(2,5);
			e.setEid(id);
			String str=edao.createEmployee(e);
			return str;
		}
		return "Invalid Data";
	}
	public Employee getEmployeeByID(String eid) {
		if(eid.length()<5)
			return null;
		else
			return edao.getEmployeeByID(eid);
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}
	public String deleteEmployee(String eid) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
