package projects;
import java.util.Scanner;
/**
 * @author karimulla shaik
 *
 */
public class main
{
	EmployeeService emp=new EmployeeService();
	static Scanner sc=new Scanner(System.in);
	void meth1()
	{
		System.out.println("******* welcome to employee management application *******");
		System.out.println("1.add employee");
		System.out.println("2.view employee");
		System.out.println("3.update employee");
		System.out.println("4.delete employee");
		System.out.println("5.view all employees");
		System.out.println("6.exit");
		meth2();
	}
	void meth2()
	{
		System.out.println("enter your choice");
		String choice=sc.next();
		switch(choice)
		{
		case "1":
		{
			emp.addemp();
			meth1();
			break;
		}
		case "2":
		{
			emp.viewemp();
			meth1();
			break;
		}
		case "3":
		{
			emp.updateemp();
			meth1();
			break;
		}
		case "4":
		{
			emp.deleteemp();
			meth1();
			break;
		}
		case "5":
		{
			emp.viewallemps();
			meth1();
			break;
		}
		case "6":
		{
			System.out.println("thank you for using application");
			System.exit(0);
		}
		default:
		{
			System.out.println("wrong input");
			meth2();
		}
		}
		sc.close();
	}
	public static void main(String[] args)
	{
		main obj=new main();
		obj.meth1();
	}
}
