package com.encapsulation;

public class LoanApplicationMain {
	public static void main(String[] args) {
		LoanApplication loan = new LoanApplication("Seetha",20000,300,2,120);
		loan.displayLoanDetails();
		System.out.println();
		System.out.println("*****After Updation*****");
		System.out.println();
		LoanApplication loan1 = new LoanApplication("Seetha",18000,300,2,120);
		loan1.displayLoanDetails();
	}
}