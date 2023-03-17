package Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dao.impl.BankDaoImpl;

import com.entity.Bank;

public class BankService 
{
	public void ViewAll() throws ClassNotFoundException, SQLException
	{
		List<Bank>list=new  BankDaoImpl().findAll();
		for(Bank i:list)
		{
			System.out.println(i);
		}
				
	}
	
	
	
	
	public void CreatAccountBank() throws ClassNotFoundException, SQLException
	{
		Bank b=new Bank();
		System.out.println("****Welcome To Phaltan Bank******");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account Number:");
		int Acc_no=sc.nextInt();
		System.out.println("Enter the 5 Digit Password:");
		String Password=sc.next();
		System.out.println("Enter your Name:");
		String Name=sc.next();
		System.out.println("Required the Minimum Balance:");
		String Balance=sc.next();
		b.setAcc_no(Acc_no);
		b.setPassword(Password);
		b.setName(Name);
		b.setBalance(Balance);
		System.out.println("Your Account Created Succesfully");
		new BankDaoImpl().CreatAccountBank(b);
	}
	public void UpdateBank() throws ClassNotFoundException, SQLException
	{
		Bank b=new Bank();
		Scanner sc=new Scanner(System.in);
		System.out.println("How much money you want in your account");
		String Add_Money=sc.next();
		System.out.println("Enter Account Number for update:");
		int acc=sc.nextInt();
		b.setAcc_no(acc);
	
		b.setBalance(Add_Money);
		System.out.println("Ammount Updated to your account succesfully :"+b.getBalance());
		new BankDaoImpl().UpdateBank(b);
	}
	public void BalanceBank() throws ClassNotFoundException, SQLException
	{
		
			
	Bank b=new Bank();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Account Number");
	int acc=sc.nextInt();
	b.setAcc_no(acc);
	new BankDaoImpl().BalanceBank(b);
	System.out.println(b.getBalance());
	List<Bank>list=new  BankDaoImpl().findAll();
	for(Bank i:list)
	{
		System.out.println(i);
	}
	}
public void DeleteBank() throws ClassNotFoundException, SQLException
{
	Bank b=new Bank();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Account Number");
	int acc=sc.nextInt();
	b.setAcc_no(acc);
	System.out.println("Account Created Succesfully !! Visit Again");
	new BankDaoImpl().DeleteBank(b);
}

}
