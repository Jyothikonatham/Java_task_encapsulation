package com.encapsulation;

public class FixedDepositMain {
	public static void main(String[] args) {
		FixedDepositAccount fdamount=new FixedDepositAccount("Ramu",70000.00,2000.00,1,11500);
		System.out.println(fdamount.calculateMaturityAmount());
		fdamount.withdrawBeforeMaturity(25);
	}
}