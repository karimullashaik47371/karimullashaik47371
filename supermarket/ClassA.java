package supermarket;
import java.util.Scanner;
public class ClassA
{
	static Scanner sc=new Scanner(System.in);
	static int sum=0;
	String result="";
	static int c=0;
	static String name;
	static String phno;
	static String emailid;
	static String address;
	static int discount=0;
	public void meth1()
	{
		System.out.println("****** welcome to dmart store ******");
		System.out.println("=========================================");
		System.out.println("available products in this store");
		products();
	}
	public void products()
	{
		System.out.println("1)biscuits");
		System.out.println("2)soaps");
		System.out.println("3)pastes");
		System.out.println("4)dolls");
		System.out.println("5)friuts");
		System.out.println("6)exit");
		choice();
	}
	public void choice()
	{
		System.out.println("enter your choice number");
		String choice=sc.next();
		switch(choice)
		{
		case "1":
		{
			biscuits();
			break;
		}
		case "2":
		{
			soaps();
			break;
		}
		case "3":
		{
			pastes();
			break;
		}
		case "4":
		{
			dolls();
			break;
		}
		case "5":
		{
			break;
		}
		case "6":
		{
			System.out.println("thank you for using this application");
			reciept();
			break;
		}
		default:
		{
			System.out.println("wrong input");
			products();
		}
		}
	}
	public void biscuits()
	{
		System.out.println("101     oreo     1pc     35/-");
		System.out.println("102    jim-jam   1pc     20/-");
		System.out.println("103     parle    1pc     15/-");
		System.out.println("104     50-50    1pc     30/-");
		System.out.println("105  marie-gold  1pc     25/-");
		System.out.println("enter your item code :");
		String icode=sc.next();
		switch(icode)
		{
		case "101":
		{
			System.out.println("how many pcs do you want ?");
			int quantity=sc.nextInt();
			int cost=quantity*35;
			sum=sum+cost;
			result=result+(++c+"     	oreo     	"+quantity+"     	"+cost+"/-\n");
			System.out.println("for continue shopping press 1");
			System.out.println("for exit press 0");
			String input=sc.next();
			switch(input)
			{
			case "1":
			{
				meth1();
				break;
			}
			case "0":
			{
				reciept();
				break;
			}
			default:
			{
				System.out.println("wrong input");
				biscuits();
				break;
			}
			}
			break;
		}
		case "102":
		{
			System.out.println("how many pcs do you want ?");
			int quantity=sc.nextInt();
			int cost=quantity*20;
			sum=sum+cost;
			result=result+(++c+"     	jim-jam     	"+quantity+"     	"+cost+"/-\n");
			System.out.println("for continue shopping press 1");
			System.out.println("for exit press 0");
			String input=sc.next();
			switch(input)
			{
			case "1":
			{
				meth1();
				break;
			}
			case "0":
			{
				reciept();
				break;
			}
			default:
			{
				System.out.println("wrong input");
				biscuits();
				break;
			}
			}
			break;
		}
		case "103":
		{
			System.out.println("how many pcs do you want ?");
			int quantity=sc.nextInt();
			int cost=quantity*30;
			sum=sum+cost;
			result=result+(++c+"     	50-50     	"+quantity+"     	"+cost+"/-\n");
			System.out.println("for continue shopping press 1");
			System.out.println("for exit press 0");
			String input=sc.next();
			switch(input)
			{
			case "1":
			{
				meth1();
				break;
			}
			case "0":
			{
				reciept();
				break;
			}
			default:
			{
				System.out.println("wrong input");
				biscuits();
				break;
			}
			}
			break;
		}
		case "104":
		{
			System.out.println("how many pcs do you want ?");
			int quantity=sc.nextInt();
			int cost=quantity*15;
			sum=sum+cost;
			result=result+(++c+"     	parle     	"+quantity+"     	"+cost+"/-\n");
			System.out.println("for continue shopping press 1");
			System.out.println("for exit press 0");
			String input=sc.next();
			switch(input)
			{
			case "1":
			{
				meth1();
				break;
			}
			case "0":
			{
				reciept();
				break;
			}
			default:
			{
				System.out.println("wrong input");
				biscuits();
				break;
			}
			}
			break;
		}
		case "105":
		{
			System.out.println("how many pcs do you want ?");
			int quantity=sc.nextInt();
			int cost=quantity*25;
			sum=sum+cost;
			result=result+(++c+"     	marie-gold     	"+quantity+"     	"+cost+"/-\n");
			System.out.println("for continue shopping press 1");
			System.out.println("for exit press 0");
			String input=sc.next();
			switch(input)
			{
			case "1":
			{
				meth1();
				break;
			}
			case "0":
			{
				reciept();
				break;
			}
			default:
			{
				System.out.println("wrong input");
				biscuits();
				break;
			}
			}
			break;
		}
		default:
		{
			System.out.println("wrong input");
			biscuits();
			break;
		}
		}
	}
	public void reciept()
	{
		if(sum>=1000)
		{
			discount=(sum*10)/100;
			details();
		}
		else
		{
			details();
		}
		System.out.println("******** DMART *********");
		System.out.println("thank you for shopping");
		System.out.println("=======================");
		System.out.println("customer name :"+name);
		System.out.println("customer phone no :"+phno);
		System.out.println("customer email id :"+emailid);
		System.out.println("customer address :"+address);
		System.out.println("===========================");
		System.out.println(result);
		System.out.println("------------------------------");
		System.out.println("");
		System.out.println("your total cost        :"+sum);
		System.out.println("your discounted amount :"+discount);
		System.out.println("you have to pay        :"+(sum-discount));
		System.out.println("                                                 ");
		System.out.println("                                                        ");
		System.out.println("                                                            ");
		System.out.println("                                                checking officer signature");
		System.out.println("                                                              ||                ");
		System.out.println("                                                              ||");
		System.out.println("                                                             here              ");
		System.out.println("=======  java is awesome =========");
	}
	public void details()
	{
		System.out.println("enter your name :");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("enter your phone no :");
		phno=sc.nextLine();
		System.out.println("enter your email id :");
		emailid=sc.nextLine();
		System.out.println("enter your address :");
		address=sc.nextLine();	
	}
	public void soaps()
	{
		System.out.println("106     mysooresandal	 1pc     75/-");
		System.out.println("107     santoor	         1pc     40/-");
		System.out.println("108     dettol	         1pc     45/-");
		System.out.println("109     lux	         1pc     70/-");
		System.out.println("110     margo	         1pc     40/-");
		System.out.println("enter your item code :");
		String icode=sc.next();
		switch(icode)
		{
		case "106":
		{
			System.out.println("how many pcs do you want ?");
			int quantity=sc.nextInt();
			int cost=quantity*75;
			sum=sum+cost;
			result=result+(++c+"     	mysoorsandal     	"+quantity+"     	"+cost+"/-\n");
			System.out.println("for continue shopping press 1");
			System.out.println("for exit press 0");
			String input=sc.next();
			switch(input)
			{
			case "1":
			{
				meth1();
				break;
			}
			case "0":
			{
				reciept();
				break;
			}
			default:
			{
				System.out.println("wrong input");
				soaps();
				break;
			}
			}
			break;
		}
		case "107":
		{
			System.out.println("how many pcs do you want ?");
			int quantity=sc.nextInt();
			int cost=quantity*40;
			sum=sum+cost;
			result=result+(++c+"     	santoor     	"+quantity+"     	"+cost+"/-\n");
			System.out.println("for continue shopping press 1");
			System.out.println("for exit press 0");
			String input=sc.next();
			switch(input)
			{
			case "1":
			{
				meth1();
				break;
			}
			case "0":
			{
				reciept();
				break;
			}
			default:
			{
				System.out.println("wrong input");
				soaps();
				break;
			}
			}
			break;
		}
		case "108":
		{
			System.out.println("how many pcs do you want ?");
			int quantity=sc.nextInt();
			int cost=quantity*45;
			sum=sum+cost;
			result=result+(++c+"     	dettol     	"+quantity+"     	"+cost+"/-\n");
			System.out.println("for continue shopping press 1");
			System.out.println("for exit press 0");
			String input=sc.next();
			switch(input)
			{
			case "1":
			{
				meth1();
				break;
			}
			case "0":
			{
				reciept();
				break;
			}
			default:
			{
				System.out.println("wrong input");
				soaps();
				break;
			}
			}
			break;
		}
		case "109":
		{
			System.out.println("how many pcs do you want ?");
			int quantity=sc.nextInt();
			int cost=quantity*70;
			sum=sum+cost;
			result=result+(++c+"     	lux     	"+quantity+"     	"+cost+"/-\n");
			System.out.println("for continue shopping press 1");
			System.out.println("for exit press 0");
			String input=sc.next();
			switch(input)
			{
			case "1":
			{
				meth1();
				break;
			}
			case "0":
			{
				reciept();
				break;
			}
			default:
			{
				System.out.println("wrong input");
				soaps();
				break;
			}
			}
			break;
		}
		case "110":
		{
			System.out.println("how many pcs do you want ?");
			int quantity=sc.nextInt();
			int cost=quantity*40;
			sum=sum+cost;
			result=result+(++c+"     	margo     	"+quantity+"     	"+cost+"/-\n");
			System.out.println("for continue shopping press 1");
			System.out.println("for exit press 0");
			String input=sc.next();
			switch(input)
			{
			case "1":
			{
				meth1();
				break;
			}
			case "0":
			{
				reciept();
				break;
			}
			default:
			{
				System.out.println("wrong input");
				soaps();
				break;
			}
			}
			break;
		}
		default:
		{
			System.out.println("wrong input");
			soaps();
			break;
		}
		}
	}
	public void pastes()
	{
		System.out.println("111     colgate     1pc     40/-");
		System.out.println("112     closeup     1pc     60/-");
		System.out.println("113    daburred     1pc     80/-");
		System.out.println("114     meswak      1pc    120/-");
		System.out.println("115   sensodyne     1pc    150/-");
		System.out.println("enter your item code :");
		String icode=sc.next();
		switch(icode)
		{
		case "111":
		{
			System.out.println("how many pcs do you want ?");
			int quantity=sc.nextInt();
			int cost=quantity*40;
			sum=sum+cost;
			result=result+(++c+"     	colgate     	"+quantity+"     	"+cost+"/-\n");
			System.out.println("for continue shopping press 1");
			System.out.println("for exit press 0");
			String input=sc.next();
			switch(input)
			{
			case "1":
			{
				meth1();
				break;
			}
			case "0":
			{
				reciept();
				break;
			}
			default:
			{
				System.out.println("wrong input");
				pastes();
				break;
			}
			}
			break;
		}
		case "112":
		{
			System.out.println("how many pcs do you want ?");
			int quantity=sc.nextInt();
			int cost=quantity*60;
			sum=sum+cost;
			result=result+(++c+"     	closeup     	"+quantity+"     	"+cost+"/-\n");
			System.out.println("for continue shopping press 1");
			System.out.println("for exit press 0");
			String input=sc.next();
			switch(input)
			{
			case "1":
			{
				meth1();
				break;
			}
			case "0":
			{
				reciept();
				break;
			}
			default:
			{
				System.out.println("wrong input");
				pastes();
				break;
			}
			}
			break;
		}
		case "113":
		{
			System.out.println("how many pcs do you want ?");
			int quantity=sc.nextInt();
			int cost=quantity*80;
			sum=sum+cost;
			result=result+(++c+"     	daburred     	"+quantity+"     	"+cost+"/-\n");
			System.out.println("for continue shopping press 1");
			System.out.println("for exit press 0");
			String input=sc.next();
			switch(input)
			{
			case "1":
			{
				meth1();
				break;
			}
			case "0":
			{
				reciept();
				break;
			}
			default:
			{
				System.out.println("wrong input");
				pastes();
				break;
			}
			}
			break;
		}
		case "114":
		{
			System.out.println("how many pcs do you want ?");
			int quantity=sc.nextInt();
			int cost=quantity*120;
			sum=sum+cost;
			result=result+(++c+"     	meswak     	"+quantity+"     	"+cost+"/-\n");
			System.out.println("for continue shopping press 1");
			System.out.println("for exit press 0");
			String input=sc.next();
			switch(input)
			{
			case "1":
			{
				meth1();
				break;
			}
			case "0":
			{
				reciept();
				break;
			}
			default:
			{
				System.out.println("wrong input");
				pastes();
				break;
			}
			}
			break;
		}
		case "115":
		{
			System.out.println("how many pcs do you want ?");
			int quantity=sc.nextInt();
			int cost=quantity*150;
			sum=sum+cost;
			result=result+(++c+"     	sensodyne     	"+quantity+"     	"+cost+"/-\n");
			System.out.println("for continue shopping press 1");
			System.out.println("for exit press 0");
			String input=sc.next();
			switch(input)
			{
			case "1":
			{
				meth1();
				break;
			}
			case "0":
			{
				reciept();
				break;
			}
			default:
			{
				System.out.println("wrong input");
				pastes();
				break;
			}
			}
			break;
		}
		default:
		{
			System.out.println("wrong input");
			pastes();
			break;
		}
		}
	}
	public void dolls()
	{
		System.out.println("116     doreoman     1pc     160/-");
		System.out.println("117    chotabheem    1pc     240/-");
		System.out.println("118     teddybear    1pc     560/-");
		System.out.println("119     ben-10       1pc     300/-");
		System.out.println("120     tiger        1pc     210/-");
		System.out.println("enter your item code :");
		String icode=sc.next();
		switch(icode)
		{
		case "116":
		{
			System.out.println("how many pcs do you want ?");
			int quantity=sc.nextInt();
			int cost=quantity*160;
			sum=sum+cost;
			result=result+(++c+"     	doreoman     	"+quantity+"     	"+cost+"/-\n");
			System.out.println("for continue shopping press 1");
			System.out.println("for exit press 0");
			String input=sc.next();
			switch(input)
			{
			case "1":
			{
				meth1();
				break;
			}
			case "0":
			{
				reciept();
				break;
			}
			default:
			{
				System.out.println("wrong input");
				dolls();
				break;
			}
			}
			break;
		}
		case "117":
		{
			System.out.println("how many pcs do you want ?");
			int quantity=sc.nextInt();
			int cost=quantity*240;
			sum=sum+cost;
			result=result+(++c+"     	chotabheem     	"+quantity+"     	"+cost+"/-\n");
			System.out.println("for continue shopping press 1");
			System.out.println("for exit press 0");
			String input=sc.next();
			switch(input)
			{
			case "1":
			{
				meth1();
				break;
			}
			case "0":
			{
				reciept();
				break;
			}
			default:
			{
				System.out.println("wrong input");
				dolls();
				break;
			}
			}
			break;
		}
		case "118":
		{
			System.out.println("how many pcs do you want ?");
			int quantity=sc.nextInt();
			int cost=quantity*560;
			sum=sum+cost;
			result=result+(++c+"     	teddybear     	"+quantity+"     	"+cost+"/-\n");
			System.out.println("for continue shopping press 1");
			System.out.println("for exit press 0");
			String input=sc.next();
			switch(input)
			{
			case "1":
			{
				meth1();
				break;
			}
			case "0":
			{
				reciept();
				break;
			}
			default:
			{
				System.out.println("wrong input");
				dolls();
				break;
			}
			}
			break;
		}
		case "119":
		{
			System.out.println("how many pcs do you want ?");
			int quantity=sc.nextInt();
			int cost=quantity*300;
			sum=sum+cost;
			result=result+(++c+"     	ben-10     	"+quantity+"     	"+cost+"/-\n");
			System.out.println("for continue shopping press 1");
			System.out.println("for exit press 0");
			String input=sc.next();
			switch(input)
			{
			case "1":
			{
				meth1();
				break;
			}
			case "0":
			{
				reciept();
				break;
			}
			default:
			{
				System.out.println("wrong input");
				dolls();
				break;
			}
			}
			break;
		}
		case "120":
		{
			System.out.println("how many pcs do you want ?");
			int quantity=sc.nextInt();
			int cost=quantity*210;
			sum=sum+cost;
			result=result+(++c+"     	tiger     	"+quantity+"     	"+cost+"/-\n");
			System.out.println("for continue shopping press 1");
			System.out.println("for exit press 0");
			String input=sc.next();
			switch(input)
			{
			case "1":
			{
				meth1();
				break;
			}
			case "0":
			{
				reciept();
				break;
			}
			default:
			{
				System.out.println("wrong input");
				dolls();
				break;
			}
			}
			break;
		}
		default:
		{
			System.out.println("wrong input");
			dolls();
			break;
		}
		}
	}
	public static void main(String[] args)
	{
		new ClassA().meth1();
	}
}
