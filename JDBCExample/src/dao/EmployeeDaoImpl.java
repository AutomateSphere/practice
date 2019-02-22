package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import config.MyConnection;
import pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	Connection con=MyConnection.getConnection();
	@Override
	public String createEmployee(Employee e) {
		String result="";
		try {
			PreparedStatement ps=con.prepareStatement("insert into Employee Values(?,?,?,?,?)");
			ps.setString(1, e.getEid());
			ps.setString(2, e.getName());
			ps.setInt(3, e.getAge());
			ps.setDouble(4, e.getSalary());
			ps.setString(5, e.getPhone());
			int row=ps.executeUpdate();
			if(row>0)
				result="Employee Created!!!! with id-->"+e.getEid();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return result;
	}

	@Override
	public Employee getEmployeeByID(String eid) {
			Employee e=null;
		try {
			PreparedStatement ps=con.prepareStatement("select * from Employee where empid=?");
			ps.setString(1,eid);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				e=new Employee(rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getString(5));
				e.setEid(rs.getString(1));
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee(String eid) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
