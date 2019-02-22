package pojo;

public class Employee {
	private String eid;
	private String name;
	private int age;
	private double salary;
	private String phone;
	public Employee()
	{}
	public Employee(String name, int age, double salary,
			String phone) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.phone = phone;
	}
	
	public void setEid(String eid) {
		this.eid = eid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEid() {
		return eid;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	public String getPhone() {
		return phone;
	}
	
	public String toString()
	{
		return eid+"\t"+name+"\t"+age+"\t"+salary+"\t"+phone;
	}
}
