package projects;
import java.util.Scanner;
public class Menu 
{
	static Scanner sc=new Scanner(System.in);
	static Atminterface ai=new Atminterfaceimplementation();
	public static void main(String[] args)
	{
		int atmnumber=1234;
		int atmpin=1234;
		System.out.println("welcome to karimulla atm machine !!!");
		System.out.print("enter atm number :");
		int atmnum=sc.nextInt();
		System.out.println("enter atm pin :");
		int atmpinnum=sc.nextInt();
		if(atmnumber==atmnum && atmpin==atmpinnum)
		{
			System.out.println("user validated successfully !!!");
			meth1();
		} 
		else
		{
			System.out.println("incorrect atm number or pin !!!");
			System.exit(0);
		}
	}
	static public void meth1()
	{
		System.out.println("1)view available balance\n2.withdraw amount\n3.diposit amount\n4.view ministatement\n5.exit");
		System.out.println("enter your choice !!!");
		String choice=sc.next();
		switch(choice)
		{
		case "1":
		{
			ai.viewbalance();
			meth1();
			break;
		}
		case "2":
		{
			System.out.println("enter withdraw amount");
			double wamount=sc.nextDouble();
			ai.withdarwamount(wamount);
			meth1();
			break;
		}
		case "3":
		{
			System.out.println("enter deposit amount :");
			double damount=sc.nextDouble();
			ai.depositamount(damount);
			meth1();
			break;
		}
		case "4":
		{
			ai.viewministatement();
			meth1();
			break;
		}
		case "5":
		{
			System.out.println("collect your card\nthank you for using atm machine");
			System.exit(0);
		}
		default:
		{
			System.out.println("wrong input");
		}
		}
	}
}
