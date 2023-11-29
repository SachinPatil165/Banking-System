package com.bank.stage1;

import java.util.Scanner;

public class Main {
	Opration o=new Opration();
	Scanner sc=new Scanner(System.in);
	int a;
	int b=0;
	public void m1()
	{
		System.out.println(" Welcome XYZ Bank \n select option from bellow \n 1) Account Create \n 2) Show Account details \n 3)"
				+ " Deposit Money \n 4) Withdrawal money \n 5) Balance enquiri");
	  a=sc.nextInt();
	  
	}
	
	public void m2()
	{

		
		switch(a)
		{
		case 1:
			o.Acc_open();
			break;
			
		case 2:
			o.Acc_Info();
			break;
		
		case 3:
			o.Deposit();
			break;
			
		case 4:
			o.Withdrawal();
			break;
			
		case 5:
			o.BalanceInfo();
			break;
		
		default:
			System.out.println("Your choice is Wrong");
			
		
		}
		System.out.println(" You want to contionue or exit \n 1) continue \n 2) Exit");
		b=sc.nextInt();

	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main z=new Main();
		z.m1();
		z.m2();
		for (int i =1;i==z.b;)
		{
			z.m1();
			z.m2();
		}
		
		if(z.b==2)
		{
			System.out.println("See You Once again");
			System.out.println("Thank You !");
		}
		
		
		
			
		
	}

}
