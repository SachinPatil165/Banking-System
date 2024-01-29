package com.tech.bank;

import lombok.Data;

@Data
public class Account {
	private int Account_Number;
	private String Name;
	private Address Address;
	private long Mobile_Number;
//	private String Password;
	private Double Balance;

}
