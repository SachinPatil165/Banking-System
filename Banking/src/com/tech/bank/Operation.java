package com.tech.bank;
import java.util.Scanner;
public class Operation {
	Scanner sc=new Scanner(System.in);
	Account ac=new Account();
	Address as=new Address();
	
	public void Account_open()
	{
		System.out.println("Enter Your Account Number");
		ac.setAccount_Number(sc.nextInt());
	
		System.out.println("entr your name");
		ac.setName(sc.next());
		
		System.out.println("enter your area name");
		as.setArea_Name(sc.next());
		System.out.println("enter your city name");
		as.setCity_Name(sc.next());
		System.out.println("enter your pincode");
		as.setPincode(sc.nextInt());
		ac.setAddress(as);
		
		System.out.println("enter your password");
		ac.setPassword(sc.next());
		
		System.out.println("enter a mobile number");
		ac.setMobile_Number(sc.nextLong());
		
		System.out.println("Enter a deposit ammount more then Rs500");
		double x=sc.nextDouble();
		if(x>=500)
		{
			ac.setBalance(x);
		}
		else
		{
			System.out.println("ammount is less then Rs500");
			while(x<=500)
			{
				System.out.println("enter a amount again");
				x=sc.nextDouble();
			}
			ac.setBalance(x);
		}
		System.out.println("your account is created");
		
	}
	public void Account_Info()
	{
		System.out.println("Enter your account number");
		int x=sc.nextInt();
		if(x==ac.getAccount_Number())
		{
			System.out.println("your account number is : "+ac.getAccount_Number());
			System.out.println("your name is : "+ac.getName());
			System.out.println("your address is : "+ac.getAddress());
			System.out.println("your mobile number is : "+ac.getMobile_Number());
			System.out.println("your account balance is : "+ac.getBalance());
		}
		else
		{
			System.out.println("Enter a valid account number");
		}
	}
	public void Balance_Info()
	{

		System.out.println("Enter your account number");
		int x=sc.nextInt();
		if(x==ac.getAccount_Number())
		{
			
			System.out.println(ac.getBalance());
			System.out.println("your account balance is : "+ac.getBalance());
			System.out.println("Operation successful...");
		}
		else
		{
			System.out.println("Enter a valid account number");
		}
	}
	public void Deposit()
	{

		System.out.println("Enter your account number");
		int x=sc.nextInt();
		if(x==ac.getAccount_Number())
		{
			System.out.println("enter a ammount which you want to deposit");
			ac.setBalance(ac.getBalance()+sc.nextDouble());
			System.out.println("your account balance is : "+ac.getBalance());
			System.out.println("ammount deposited...");
		}
		else
		{
			System.out.println("Enter a valid account number");
		}
	}
	public void Withdrwall()
	{

		System.out.println("Enter your account number");
		int x=sc.nextInt();
		if(x==ac.getAccount_Number())
		{
			System.out.println("enter a ammount which you want to withdrall");
			double d=sc.nextDouble();
			if(ac.getBalance()-d>=500)
			{
				ac.setBalance(ac.getBalance()-d);
			}
			else
			{
				System.out.println("insufficent balance");
			}
			System.out.println("your account balance is : "+ac.getBalance());
			System.out.println("operation successful...");
			
		}
		else
		{
			System.out.println("Enter a valid account number");
		}
	}
	

}
