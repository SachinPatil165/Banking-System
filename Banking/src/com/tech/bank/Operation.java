package com.tech.bank;

import java.util.Scanner;

public class Operation {
	Scanner sc = new Scanner(System.in);
	Account ac = new Account();
	Address as = new Address();

	public void Account_open() {
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
//
//		System.out.println("enter your password");
//		ac.setPassword(sc.next());

		System.out.println("enter a mobile number");
		ac.setMobile_Number(sc.nextLong());

		System.out.println("Enter a deposit ammount more then Rs500");
		double x = sc.nextDouble();
		if (x >= 500) {
			ac.setBalance(x);
		} else {
			System.out.println(ac.getName() + " you enter ammount is less then 500");
			while (x <= 500) {
				System.out.println(ac.getName() + " enter a amount again");
				x = sc.nextDouble();
			}
			ac.setBalance(x);
		}
		System.out.println(ac.getName() + " your account is created");

	}

	public void Account_Info() {
		System.out.println("Enter your account number");
		int x = sc.nextInt();
		if (x == ac.getAccount_Number()) {
			System.out.println(ac.getName() + " your account number is : " + ac.getAccount_Number());
			System.out.println(ac.getName() + " your name is : " + ac.getName());
			System.out.println(ac.getName() + " your address is : " + ac.getAddress());
			System.out.println(ac.getName() + " your mobile number is : " + ac.getMobile_Number());
			System.out.println(ac.getName() + " your account balance is : " + ac.getBalance());
		} else {
			System.out.println("sorry " + ac.getName() + " account number is wrong");
			while (x != ac.getAccount_Number()) {
				System.out.println(ac.getName() + " enter account number again");
				x = sc.nextInt();
				if (x == ac.getAccount_Number()) {
					System.out.println(ac.getName() + " your account number is : " + ac.getAccount_Number());
					System.out.println(ac.getName() + " your name is : " + ac.getName());
					System.out.println(ac.getName() + " your address is : " + ac.getAddress());
					System.out.println(ac.getName() + " your mobile number is : " + ac.getMobile_Number());
					System.out.println(ac.getName() + " your account balance is : " + ac.getBalance());
				}
			}
		}
	}

	public void Balance_Info() {

		System.out.println("Enter your account number");
		int x = sc.nextInt();
		if (x == ac.getAccount_Number()) {

			System.out.println(ac.getName() + " your account balance is : " + ac.getBalance());
			System.out.println(ac.getName() + " your Operation successful...");
		} else {
			System.out.println("sorry " + ac.getName() + " account number is wrong");
			while (x != ac.getAccount_Number()) {
				System.out.println(ac.getName() + " enter account number again");
				x = sc.nextInt();
				if (x == ac.getAccount_Number()) {

					
					System.out.println(ac.getName() + " your account balance is : " + ac.getBalance());
					System.out.println(ac.getName() + " your Operation successful...");
				}
			}
		}
	}

	public void Deposit() {

		System.out.println("Enter your account number");
		int x = sc.nextInt();
		if (x == ac.getAccount_Number()) {
			System.out.println(ac.getName() + " enter a ammount which you want to deposit");
			ac.setBalance(ac.getBalance() + sc.nextDouble());
			System.out.println(ac.getName() + " your account balance is : " + ac.getBalance());
			System.out.println(ac.getName() + " your ammount deposited...");
		} else {
			System.out.println("sorry " + ac.getName() + " your account number is wrong");
			while (x != ac.getAccount_Number()) {
				System.out.println(ac.getName() + " enter account number again");
				x = sc.nextInt();
				if (x == ac.getAccount_Number()) {
					System.out.println(ac.getName() + " enter a ammount which you want to deposit");
					ac.setBalance(ac.getBalance() + sc.nextDouble());
					System.out.println(ac.getName() + " your account balance is : " + ac.getBalance());
					System.out.println(ac.getName() + " your ammount deposited...");
				}
			}
		}
	}

	public void Withdrwall() {

		System.out.println("Enter your account number");
		int x = sc.nextInt();
		if (x == ac.getAccount_Number()) {
			System.out.println(ac.getName() + " enter a ammount which you want to withdrall");
			double d = sc.nextDouble();
			if (ac.getBalance() - d >= 500) {
				ac.setBalance(ac.getBalance() - d);
			} else {

				System.out.println("sorry "+ac.getName() + " your balance is insufficent");

				while (ac.getBalance() - d < 500) {
					System.out.println(ac.getName() + " enter ammount is again");
					d = sc.nextDouble();

				}
			}
			System.out.println(ac.getName() + " your account balance is : " + ac.getBalance());
			System.out.println(ac.getName() + " your operation successful...");

		} else {
			System.out.println("sorry " + ac.getName() + " account number is wrong");
			while (x != ac.getAccount_Number()) {
				System.out.println(ac.getName() + " enter account number again");
				x = sc.nextInt();
				if (x == ac.getAccount_Number()) {
					System.out.println(ac.getName() + " enter a ammount which you want to withdrall");
					double d = sc.nextDouble();
					if (ac.getBalance() - d >= 500) {
						ac.setBalance(ac.getBalance() - d);
					} else {

						System.out.println("sorry "+ac.getName() + " your balance is insufficent");

						while (ac.getBalance() - d < 500) {
							System.out.println(ac.getName() + " enter ammount is again");
							d = sc.nextDouble();

						}
					}
					System.out.println(ac.getName() + " your account balance is : " + ac.getBalance());
					System.out.println(ac.getName() + " your operation successful...");

				}
			}
		}
	}

}
