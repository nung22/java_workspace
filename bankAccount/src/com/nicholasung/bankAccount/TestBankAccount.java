package com.nicholasung.bankAccount;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount(5500.50,10000.60);
		
		System.out.println("---------- Deposit Test ----------");
		account1.deposit(500.50, "Checking");
		account1.deposit(500.50, "Savings");
		account2.deposit(500.50, "Checking");
		account2.deposit(500.50, "Savings");
		System.out.printf("Account 1 %nChecking Balance: $%.2f %nSavings Balance: $%.2f%n%n",account1.getCheckingBalance(),account1.getSavingsBalance());
		System.out.printf("Account 2 %nChecking Balance: $%.2f %nSavings Balance: $%.2f%n%n",account2.getCheckingBalance(),account2.getSavingsBalance());
		
		System.out.println("---------- NumAccounts & TotalMoney Test ----------");
		System.out.printf("Number of Accounts: %d%n", BankAccount.getNumAccounts());
		System.out.printf("Total Money: $%.2f%n%n", BankAccount.getTotalMoney());
		
		System.out.println("---------- Withdraw Test ----------");
		account1.withdraw(700.50, "Checking");
		account2.withdraw(750.50, "Savings");
		System.out.printf("Account 1 %nChecking Balance: $%.2f %nSavings Balance: $%.2f%n%n",account1.getCheckingBalance(),account1.getSavingsBalance());
		System.out.printf("Account 2 %nChecking Balance: $%.2f %nSavings Balance: $%.2f%n%n",account2.getCheckingBalance(),account2.getSavingsBalance());
		System.out.printf("Total Money: $%.2f%n%n", BankAccount.getTotalMoney());
		
		System.out.println("---------- AccountNumber Test ----------");
		System.out.printf("Account 1 Acct# : %s%n", account1.getAccountNumber());
		System.out.printf("Account 2 Acct# : %s%n", account2.getAccountNumber());
	}

}
