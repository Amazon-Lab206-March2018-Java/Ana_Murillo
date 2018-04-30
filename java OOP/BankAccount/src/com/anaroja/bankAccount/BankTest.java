package com.anaroja.bankAccount;

	public class BankTest {

		public static void main(String[] args) {
			BankAccount ana = new BankAccount();
			ana.addCheckBalance(5200.00);
			ana.addSavings(1920.00);
			ana.withdraw("savings", 500.00);
			System.out.println(ana.getSavings_balance());
			System.out.println(ana.getChecking_balance());
			System.out.println(ana.total());
		}
}
