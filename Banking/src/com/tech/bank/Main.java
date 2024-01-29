package com.tech.bank;

import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	Operation op = new Operation();

	public void switchcase() {
		System.out.println(
				"choice the which operation you want to perform\n1.Account open\n2.Account Info\n3.Balance Info\n4.Deposit ammount\n5.Withdrwall ammount");
		int x = sc.nextInt();
		switch (x) {
		case 1:
			op.Account_open();
			break;
		case 2:
			op.Account_Info();
			break;

		case 3:
			op.Balance_Info();
			break;

		case 4:
			op.Deposit();
			break;

		case 5:
			op.Withdrwall();
			break;

		default:
			System.out.println("wrong choice");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
	
		do {
			m.switchcase();
			System.out.println(" you want to continue...\n1.Yes\n2.no");
			int x = sc.nextInt();
			if (x == 2) {
				break;
			}

		} while (true);
//		while(true)
//		{
//			m.switchcase();
//			
//		}

	}

}
