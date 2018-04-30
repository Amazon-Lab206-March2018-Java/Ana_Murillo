package com.anaroja.bankAccount;

import java.util.Random;

public class BankAccount {
	private String account_Number;
	private Double checking_balance = 0.00;
	private Double savings_balance = 0.00;
	public static int accountsCreated = 0;
	public static int moneySaved = 0;

	public BankAccount() {
		this.account_Number = accountNumber();
		accountsCreated++;
	}
	
	private String accountNumber() {
        Random ran = new Random();
        int number = ran.nextInt(9000000) + 1000000000;
        String result = String.valueOf(number);
        System.out.println(result);
        return result;
    }
	
	//getter method for the user's checking account balance.
	public Double getChecking_balance() {
		return checking_balance;
	}
	//getter method for the user's saving account balance.
	public Double getSavings_balance() {
		return savings_balance;
	}
	
	public void addCheckBalance(Double amount) {
		this.checking_balance += amount;
		moneySaved+=amount;
	}
	
	public void addSavings(Double amount ) {
		this.savings_balance += amount ;
		moneySaved+=amount ;
	}
	public void withdraw(String account, Double amount) {
		if (account == "savings"){
			this.savings_balance -= amount;
		}
		else {
			this.checking_balance -= amount;
		}
		moneySaved-=amount;
	}
	public String total(){
		String Result = "The checking has "+checking_balance+" and the Savings has "+savings_balance;
		return Result;
	}
}
