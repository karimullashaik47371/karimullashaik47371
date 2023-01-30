package employeeapp;

public class Empdetails
{
	private int id;
	private String name;
	private int age;
	private String department;
	private double salary;
	private String phno;
	private String emailid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + ", salary="
				+ salary + ", phno=" + phno + ", emailid=" + emailid + "]";
	}
	public Empdetails(int id, String name, int age, String department, double salary, String phno, String emailid) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
		this.phno = phno;
		this.emailid = emailid;
	}
}
