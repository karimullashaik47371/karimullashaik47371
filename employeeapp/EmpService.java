package employeeapp;
import java.util.LinkedList;
import java.util.Scanner;
public class EmpService 
{
	static boolean found=true;
	static Scanner sc=new Scanner(System.in);
	LinkedList<Empdetails>ll=new LinkedList<Empdetails>();
	Empdetails emp1=new Empdetails(101,"karimulla",22,"corejava",40000,"7386819353","karim@gmail.com");
	Empdetails emp2=new Empdetails(102,"alekhya",21,"corejava",39000,"9848012345","alekhya@gmail.com");
	Empdetails emp3=new Empdetails(103,"ravindra",22,"RPA",48000,"9603564928","ravindra@gmail.com");
	Empdetails emp4=new Empdetails(104,"dinakar",25,"Salesforce",41000,"6303229205","dinakar@gmail.com");
	Empdetails emp5=new Empdetails(105,"eswar",35,"SAP",45000,"9052427446","eswar@gmail.com");
	Empdetails emp6=new Empdetails(106,"yogi",27,"Testing",27000,"6281869485","yogi@gmail.com");
	Empdetails emp7=new Empdetails(107,"ravindra.k",26,"fullstackjava",50000,"6304524487","kravindra@gmail.com");
	Empdetails emp8=new Empdetails(108,"siva",23,"network",34000,"9133638549","siva@gmail.com");
	Empdetails emp9=new Empdetails(109,"ganesh",20,"uideveloper",35000,"9347038127","ganesh@gmail.com");
public EmpService()
{
	ll.add(emp1);
	ll.add(emp2);
	ll.add(emp3);
	ll.add(emp4);
	ll.add(emp5);
	ll.add(emp6);
	ll.add(emp7);
	ll.add(emp8);
	ll.add(emp9);
}
// view all employees
public void viewallemp()
{
	for(Empdetails emp:ll)
		System.out.println(emp);
}
// view employee
public void viewemp()
{
	System.out.println("enter employee id : ");
	int id=sc.nextInt();
	for(Empdetails emp:ll)
	{
		if(emp.getId()==id)
		{
			System.out.println(emp);
			found=true;
		}
	}
	if(!found)
	{
		System.out.println("employee not found");
	}
	else
	{
		System.out.println("employee viewed successfully");
	}
}
// add employee
public void addemp()
{
	System.out.println("enter employee id : ");
	int id=sc.nextInt();
	System.out.println("enter employee name :");
	String name=sc.next();
	System.out.println("enter employee age :");
	int age=sc.nextInt();
	System.out.println("enter employee department :");
	String department=sc.next();
	System.out.println("enter employee salary :");
	double salary=sc.nextDouble();
	System.out.println("enter employee phone no :");
	String phno=sc.next();
	System.out.println("enter employee email id :");
	String emailid=sc.next();
	Empdetails emp=new Empdetails(id, name, age, department, salary, phno, emailid);
	ll.add(emp);
	System.out.println("employee added successfully");
}
//delete employee
public void deleteemp()
{
	System.out.println("enter employee id :");
	int id=sc.nextInt();
	Empdetails empdelete=null;
	for(Empdetails emp:ll)
	{
		if(emp.getId()==id)
		{
			empdelete=emp;
			found=true;
		}
	}
	if(!found)
	{
		System.out.println("employee not found");
	}
	else
	{
		ll.remove(empdelete);
		System.out.println("employee deleted successfully");
	}
}
// update employee
public void updateemp()
{
	System.out.println("enter emloyee id :");
	int id=sc.nextInt();
	for(Empdetails emp:ll)
	{
		if(emp.getId()==id)
		{
			System.out.println("enter employee name :");
			String name=sc.next();
			System.out.println("enter employee age :");
			int age=sc.nextInt();
			System.out.println("enter employee salary :");
			double salary=sc.nextDouble();
			System.out.println("enter employee phone no :");
			String phhno=sc.next();
			System.out.println("enter employee emailid :");
			String emailid=sc.next();
			emp.setName(name);
			emp.setAge(age);
			emp.setSalary(salary);
			emp.setPhno(phhno);
			emp.setEmailid(emailid);
			found=true;
		}
	}
	if(!found)
	{
		System.out.println("employee not found");
	}
	else
	{
		System.out.println("employee updated successfully");
	}
}
}
