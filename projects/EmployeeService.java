package projects;
import java.util.HashSet;
import java.util.Scanner;
public class EmployeeService
{
	Scanner sc=new Scanner(System.in);
	Employee emp=new Employee(0, null, 0, null, null, 0);
	static boolean found=false;
		HashSet<Employee> hs=new HashSet<Employee>();
		Employee emp1=new Employee(101,"karimulla",22,"java","developer",30000);
		Employee emp2=new Employee(102,"alekhya",22,"java","developer",29000);
		Employee emp3=new Employee(103,"ravindra",22,"rpa","ui developer",28000);
		Employee emp4=new Employee(104,"dinakar",22,"salesforce","salesforce developer",27000);
		Employee emp5=new Employee(105,"sivakrihna",22,"network","network manager",26000);
		Employee emp6=new Employee(106,"ganesh",22,"UI"," graphics developer",25000);
	public EmployeeService()
	{
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		hs.add(emp4);
		hs.add(emp5);
		hs.add(emp6);
	}
	// view all employee
	public void viewallemps()
	{
		for(Object obj:hs)
			System.out.println(obj);
	}
	//view employee
	public void viewemp()
	{
		System.out.println("enter empid : ");
		int id=sc.nextInt();
		for(Employee emp:hs)
		{
			if(emp.getId()==id)
			{
				System.out.println(emp);
				found=true;
			}
		}
		if(found!=true)
		{
			System.out.println("employee not found");
		}
	}
	//add employee
	public void addemp()
	{
		System.out.println("enter employee id");
		int id=sc.nextInt();
		System.out.println("enter employee name");
		String name=sc.next();
		System.out.println("enter employee age");
		int age=sc.nextInt();
		System.out.println("enter employee department");
		String department=sc.next();
		System.out.println("enter employee designation");
		sc.next();
		String designation=sc.nextLine();
		System.out.println("enter employee salary");
		double salary=sc.nextDouble();
		Employee emp=new Employee(id, name, age, department, designation, salary);
		hs.add(emp);
		System.out.println(emp);
		System.out.println("employee added successfully");
		
	}
	// delete employee
	public void deleteemp()
	{
		System.out.println("enter empid :");
		int id=sc.nextInt();
		Employee empdelete=null;
		for(Employee emp:hs)
		{
			if(emp.getId()==id)
			{
				empdelete=emp;
				found=true;
			}
		}
		if(!found)
		{
			System.out.println("employee is not found");
		}
		else
		{
			hs.remove(empdelete);
			System.out.println("employee deleted successfully");
		}
	}
	// update employee
	public void updateemp()
	{
		System.out.println("enter employee id :");
		int id=sc.nextInt();
		for(Employee emp:hs)
		{
			if(emp.getId()==id)
			{
				System.out.println("enter employee name");
				String name=sc.next();
				System.out.println("enter employee age");
				int age=sc.nextInt();
				System.out.println("enter employee salary");
				double salary=sc.nextDouble();
				emp.setName(name);
				emp.setAge(age);
				emp.setSalary(salary);
				System.out.println(emp);
			}
		}
		if(!found)
		{
			System.out.println("employee is not found");
		}
		else
		{
			System.out.println("employee updated successfully");
		}
	}
}
