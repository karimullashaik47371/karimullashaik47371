package adv_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EMP_App 
{
	static Scanner sc=new Scanner(System.in);
	static Connection con;
	public static void main(String[] args) throws Exception 
	{
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","karimulla");
		EMP_App obj=new EMP_App();
		obj.choice();
	}
	public void choice() throws SQLException
	{
		System.out.println("====== choice ======");
		System.out.println("1)Add Employee\n2)View Employee\n3)Update Employee\n"
				+ "4)Delete Employee\n5)View All Employees\n6)Exit");
		System.out.println("Enter Choice Number :");
		switch(Integer.parseInt(sc.nextLine()))
		{
		case 1:
		{
			this.addemp();
			this.choice();
			break;
		}
		case 2:
		{
			this.viewemp();
			this.choice();
			break;
		}
		case 3:
		{
			this.updateemp();
			this.choice();
			break;
		}
		case 4:
		{
			this.deleteemp();
			this.choice();
			break;
		}
		case 5:
		{
			this.viewallemps();
			this.choice();
			break;
		}
		case 6:
		{
			System.out.println("Thanks For Using This Application !!!");
			System.exit(0);
			break;
		}
		default:
		{
			System.out.println("Invalid Option !!!");
			this.choice();
		}
		}
	}
	public void addemp() throws SQLException
	{
		System.out.println("Enter Employee ID :");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Employee Name :");
		String name=sc.nextLine();
		System.out.println("Enter Employee Salary :");
		float sal=Float.parseFloat(sc.nextLine());
		PreparedStatement pstmt=con.prepareStatement("insert into emp1 values(?,?,?)");
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setFloat(3, sal);
		int k=pstmt.executeUpdate();
		if(k>=1)
		{
			System.out.println("Employee Added Successfully Done !!!");
		}
	}
	public void viewemp() throws SQLException
	{
		System.out.println("Enter Employee ID :");
		int id=Integer.parseInt(sc.nextLine());
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from emp1 where id="+id);
		ResultSetMetaData rm=rs.getMetaData();
		int n=rm.getColumnCount();
		if(rs.next())
		{
			for(int i=1;i<=n;i++)
			{
				System.out.print(rm.getColumnName(i)+"\t");
			}
			System.out.println();
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
		}
		else
		{
			System.out.println("Employee is Not Found !!!");
		}
	}
	public void updateemp() throws SQLException
	{
		System.out.println("Enter Employee ID :");
		int id=Integer.parseInt(sc.nextLine());
		PreparedStatement pstmt=con.prepareStatement("select * from emp1 where id="+id);
		int k=pstmt.executeUpdate();
		if(k>=1)
		{
			System.out.println("Enter Employee Name :");
			String name=sc.nextLine();
			System.out.println("Enter Employee Salary :");
			float sal=Float.parseFloat(sc.nextLine());
			PreparedStatement pstmt1=con.prepareStatement("update emp1 set name='"+name+"',sal="+sal+" where id="+id);
			int k1=pstmt1.executeUpdate();
			if(k1>=1)
			{
				System.out.println("Employee Detalis Is Successfully Updated !!!");
			}
		}
		else
		{
			System.out.println("Employee Not Found !!!");
		}
		
	}
	public void deleteemp() throws SQLException
	{
		System.out.println("Enter Employee ID :");
		int id=Integer.parseInt(sc.nextLine());
		PreparedStatement pstmt=con.prepareStatement("select * from emp1 where id="+id);
		int k=pstmt.executeUpdate();
		if(k>=1)
		{
			PreparedStatement pstmt1=con.prepareStatement("delete emp1 where id="+id);
			int k1=pstmt1.executeUpdate();
			if(k1>=1)
			{
				System.out.println("Employee Deleted Is Successfully Done !!!");
			}
		}
		else
		{
			System.out.println("Employee Not Found !!!");
		}
	}
	public void viewallemps() throws SQLException
	{
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from emp1");
		ResultSetMetaData rm=rs.getMetaData();
		int n=rm.getColumnCount();
		for(int i=1;i<=n;i++)
		{
			System.out.print(rm.getColumnName(i)+"\t");
		}
		System.out.println();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
		}
	}
}
