package com.nicholasung.bankAccount;

import java.util.Random;

public class BankAccount {
	
	Random rand = new Random();
	
	// MEMBER VARIABLES
	private double checkingBalance;
	private double savingsBalance;
	private String accountNumber;
	
	// CLASS VARIABLES
	private static int numAccounts;
	private static double totalMoney;
	
	// CONSTRUCTOR
	public BankAccount() {
		checkingBalance = 0;
		savingsBalance = 0;
		accountNumber = generateAccountNumber();
		numAccounts++;
	}
	
	// OVERLOADED CONSTRUCTOR
	public BankAccount(double checkingBalance, double savingsBalance) {
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		accountNumber = generateAccountNumber();
		numAccounts++;
		totalMoney += (checkingBalance + savingsBalance);
	}

	// CLASS METHODS
	public void deposit(double deposit, String accountType) {
		if(accountType.equals("Checking")) {
			checkingBalance += deposit;
		}
		else {
			savingsBalance += deposit;
		}
		totalMoney += deposit;
	}

	public void withdraw(double withdrawal, String accountType) {
		if(accountType.equals("Checking") && withdrawal <= checkingBalance) {
			checkingBalance -= withdrawal;
			totalMoney -= withdrawal;
		}
		else if(accountType.equals("Savings") && withdrawal <= savingsBalance) {
			savingsBalance -= withdrawal;
			totalMoney -= withdrawal;
		}
		else {
			System.out.printf("Insufficient Funds in %s Account.%n%n",accountType);
		}

	}
	
	private String generateAccountNumber() {
		String accountNumber = "";
		for(int i = 0; i < 10; i++) {
			int randDigit = rand.nextInt(10);
			accountNumber += Integer.toString(randDigit);
		}
		return accountNumber;
	}
	
	// GETTERS & SETTERS
	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public static int getNumAccounts() {
		return numAccounts;
	}

	public static double getTotalMoney() {
		return totalMoney;
	}
}
