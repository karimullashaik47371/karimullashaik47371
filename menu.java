package employeeapp;
import java.util.Scanner;
public class menu
{
	EmpService emp=new EmpService();
	static Scanner sc=new Scanner(System.in);
	public void meth1()
	{
		System.out.println("****** welcome to emp application ******");
		System.out.println("1) add employee");
		System.out.println("2) view employee");
		System.out.println("3) update employee");
		System.out.println("4) delete employee");
		System.out.println("5) view all employee");
		System.out.println("6) exit");
		meth2();
	}
	public void meth2()
	{
		System.out.println("enter your choice number");
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
			emp.viewallemp();
			meth1();
			break;
		}
		case "6":
		{
			System.out.println("thank you for using this application");
			System.exit(0);
			break;
		}
		default:
		{
			System.out.println("wrong input");
			meth2();
		}
		}
	}
	public static void main(String[] args)
	{
		new menu().meth1();
	}
}
