package com.bank.multi_user;

import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	Operation op = new Operation();
	static int a = 0;
	int x;
	static {
		System.out.println("Welcome to xyz Bank...!");
	}

	public void switchcase() {
		System.out.println(
				"choice the which operation you want to perform\n1. Account open\n2. Account Info\n3. Balance Info\n4. Deposit ammount\n5. Withdrwall ammount\n6. Transfer Money from account to account \n7. Exit");
		x = sc.nextInt();
		switch (x) {
		case 1:

			op.m1();
			break;
		case 2:
			op.m2();
			break;

		case 3:
			op.m3();
			break;

		case 4:
			op.m4();
			break;

		case 5:
			op.m5();
			break;
		case 6:
			op.m6();
			break;
		case 7:
			a = 2;
			break;
		default:
			System.out.println("wrong choice");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		while (true) {
			m.switchcase();
			if (a == 2) {
				System.out.println("thank you...!");
				System.out.println("See you again..!");
				break;
			} else {
				System.out.println(" you want to continue...\n1.Yes\n2.no");
				int x = sc.nextInt();
				if (x == 2) {
					System.out.println("thank you...!");
					System.out.println("See you again..!");
					break;
				}
			}
		}
	}
}
