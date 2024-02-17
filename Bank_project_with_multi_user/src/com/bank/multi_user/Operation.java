package com.bank.multi_user;

import java.util.Scanner;

public class Operation {
	Scanner sc = new Scanner(System.in);
	Account ac = new Account();
	int aa;
// Account open method
	public void m1() {
		System.out.println("how many account open you want");
		int a = sc.nextInt();
		aa = a;
		int x[] = new int[a];
		String s[] = new String[a];
		long l[] = new long[a];
		double Arrd[] = new double[a];
		for (int i = 0; i < a; i++) {
			System.out.println("enter a account number");
			x[i] = sc.nextInt();
			sc.nextLine();
			System.out.println("entr your name");
			s[i] = sc.nextLine();
			System.out.println("enter a mobile number");
			l[i] = sc.nextLong();
			while (true) {
				System.out.println("Enter a deposit ammount more then Rs500");
				double d = sc.nextDouble();
				if (d >= 500) {
					Arrd[i] = d;
					break;
				} else {
					System.out.println("enter ammount again ");
				}
			}
			System.out.println("your " + (i + 1) + " account is created");
		}
		ac.setAcc_no(x);
		ac.setName(s);
		ac.setM_no(l);
		ac.setBalance(Arrd);
	}
// Account details show method
	public void m2() {
		System.out.println("enter a account number");
		int x = sc.nextInt();
		for (int i = 0; i < ac.getAcc_no().length; i++) {
			if (x == ac.getAcc_no()[i]) {
				System.out.println("your account number :- " + ac.getAcc_no()[i]);
				System.out.println("your name :- " + ac.getName()[i]);
				System.out.println("your Mobile number :- " + ac.getM_no()[i]);
				System.out.println("your avaible balance :- " + ac.getBalance()[i]);
				System.out.println("************");
				break;
			}
		}
	}
// Balance details method
	public void m3() {
		System.out.println("enter a account number");
		int x = sc.nextInt();
		for (int i = 0; i < ac.getAcc_no().length; i++) {
			if (x == ac.getAcc_no()[i]) {
				System.out.println("your account number :- " + ac.getBalance()[i]);
				System.out.println("************");
				break;
			}
		}
	}
//deposite method
	public void m4() {
		System.out.println("enter a account number");
		int x = sc.nextInt();
		double Arrd[] = new double[aa];
		for (int i = 0; i < ac.getAcc_no().length; i++) {
			if (x == ac.getAcc_no()[i]) {
				System.out.println("enter ammount ");
				double d = sc.nextDouble();
				Arrd[i] = ac.getBalance()[i] + d;
				ac.setBalance(Arrd);
				System.out.println("available balance :- " + ac.getBalance()[i]);
				System.out.println("************");
				break;
			}
		}
	}
// withdwrall method
	public void m5() {
		System.out.println("enter a account number");
		int x = sc.nextInt();
		double Arrd[] = new double[aa];
		for (int i = 0; i < ac.getAcc_no().length; i++) {
			if (x == ac.getAcc_no()[i]) {
				System.out.println("enter ammount ");
				double d = sc.nextDouble();
				double dd = ac.getBalance()[i] - d;
				if (dd >= 500) {
					Arrd[i] = dd;
					ac.setBalance(Arrd);
					System.out.println("available balance :- " + ac.getBalance()[i]);
					System.out.println("************");
					break;
				} else {
					System.out.println("insufficent found");
					break;
				}
			}
		}
	}
// transfer money method
	public void m6() {
		System.out.println("Enter a Account number which you want to withdwrall money");
		int x = sc.nextInt();
		System.out.println("Enter a Account number which you want to deposite money");
		int y = sc.nextInt();
		double Arrd[] = new double[aa];
		for (int i = 0; i < ac.getAcc_no().length; i++) {
			if (x == ac.getAcc_no()[i]) {
				System.out.println("enter ammount which you want to transfer");
				double d = sc.nextDouble();
				double dd = ac.getBalance()[i] - d;
				if (dd >= 500) {
					Arrd[i] = dd;
					for (int j = 0; j < ac.getAcc_no().length; j++) {
						if (y == ac.getAcc_no()[j]) {
							Arrd[j] = ac.getBalance()[j] + d;
							ac.setBalance(Arrd);
							System.out.println("available balance of account number " + ac.getAcc_no()[j] + " is "
									+ ac.getBalance()[j]);
							System.out.println("**************");
						}
					}
					System.out.println(
							"available balance of account number " + ac.getAcc_no()[i] + " is " + ac.getBalance()[i]);
					System.out.println("************");
					break;
				} else {
					System.out.println("insufficent found in " + ac.getAcc_no()[i]);
					break;
				}
			}
		}

	}
}