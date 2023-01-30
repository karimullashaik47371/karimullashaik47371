package projects;

import java.util.HashMap;
import java.util.Map;

public class Atminterfaceimplementation implements Atminterface
{
	static Atm atm=new Atm();
	HashMap<Double,String> ministmt=new HashMap();

	@Override
	public void viewbalance()
	{
		System.out.println("available balance :"+atm.getBalance());
	}

	@Override
	public void withdarwamount(double withdrawamount)
	{
		System.out.println("you withdrawed "+withdrawamount);
		ministmt.put(withdrawamount," is withdrawn ");
		atm.setBalance(atm.getBalance()-withdrawamount);
		viewbalance();
	}

	@Override
	public void depositamount(double depositamount) 
	{
		System.out.println("you deposited "+depositamount);
		ministmt.put(depositamount," is deposited ");
		atm.setBalance(atm.getBalance()+depositamount);
		viewbalance();
	}

	@Override
	public void viewministatement() 
	{
		for(Map.Entry<Double,String> m:ministmt.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
