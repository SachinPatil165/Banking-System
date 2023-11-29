package com.bank.stage1;

import java.util.Scanner;

public class Opration {
	Scanner sc=new Scanner(System.in);
	Account a=new Account();
	
	
	 double aa;
	
	
	public void Acc_open()
	{
		
		System.out.println("Enter a Account number : ");
		a.setAcc_no(sc.nextInt());
		System.out.println("Enter your Name : ");
		
		a.setName(sc.next());
		
		System.out.println("Enter a your Mobile Number : ");
		a.setMobile_no(sc.nextInt());
		System.out.println("Enter a your Address : ");
		a.setAddress(sc.next());
		System.out.println("Enter a ammount to we want to deposit (Minimum required 500) : ");
		aa=sc.nextDouble();
		if (aa>499)
		{
			a.setBalance(aa);
		
		}
		else
		{
			System.out.println("you enter less then 500");
	
		}
//		a.setBalance(aa);
		
		Opration o=new Opration();
		//o.balance();
		System.out.println("Your Account Opened \nThank You !");
		
	}
	
	public void balance()
	{
		for (double i =500;i>=aa;)
		{
			if (aa>499)
			{
				
		
				a.setBalance(aa);
				break;
				
			}
			else
			{
				System.out.println("you enter less then 500 \nPlease enter double");
				aa=sc.nextDouble();
			
				
			}
			
		}
		
	}
	
	public void Deposit()
	{
		System.out.println("Enter a Account Number : ");
		int b=sc.nextInt();
		if(b!=a.getAcc_no())
		{
			System.out.println("You enter Wrong account number : ");
			System.out.println("Plase try Double from Starting");
			
		}
		else
		{
		System.out.println("Enter ammount which you want to deposit");
		double d=sc.nextInt();
		double z=a.getBalance()+d;
		a.setBalance(z);
		System.out.println("Ammount will be Deposited");
		System.out.println("your account balance is : "+a.getBalance());
		System.out.println("Thank You !");
		}
		
	}
	
	public void Withdrawal()
	{
		System.out.println("Enter a account number : ");
		int b1=sc.nextInt();
		if(b1!=a.getAcc_no())
		{
			System.out.println("You enter Wrong account number : ");
			System.out.println("Plase try Double from Starting");
			
		}
		else
		{
			System.out.println("Enter ammount which you want to withdrawal");
			double d=sc.nextDouble();
			if (d<a.getBalance()&& a.getBalance()>=500)
			{
				double z=a.getBalance()-d;
				a.setBalance(z);
				System.out.println("Succesful");
				System.out.println("your account balance is : "+a.getBalance());
				System.out.println("Thank You !");
			
			}
			else
			{
				System.out.println("Ammount not be debited due to account balance is low ");
			}
		
		
		}
	}
	public void BalanceInfo()
	{
		System.out.println("Enter a account number : ");
		int d=sc.nextInt();
		if(d!=a.getAcc_no())
		{
			System.out.println("You enter Wrong account number : ");
			System.out.println("Plase try Double from Starting");
			
		}
		else
		{
			System.out.println("Your account balance is : "+a.getBalance());
			System.out.println("Thank You !");
		}
		
	}
	public void Acc_Info()
	{
		System.out.println("Enter a account number : ");
		int c=sc.nextInt();
		if(c!=a.getAcc_no())
		{
			System.out.println("You enter Wrong account number : ");
			System.out.println("Plase try Double from Starting");
			
		}
		else
		{
			System.out.println("Your account Number is : "+a.getAcc_no());
			System.out.println("Your Name is : "+a.getName());
			System.out.println("Your Mobile Number is : "+a.getMobile_no());
			System.out.println("Your Address is : "+a.getAddress());
			System.out.println("Your account Balance is : "+a.getBalance());
			System.out.println("Thank You !");
		
		
	}
	

	}}

