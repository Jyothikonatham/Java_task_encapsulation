package com.encapsulation;

public class CreditCardAmount {
	private String customerName;
	private double creditLimit;
	private double currentDebt;
	private double interestRate;
	
	public CreditCardAmount(String customerName,double creditLimit,double currentDebt,double interestRate) {
		this.customerName=customerName;
		this.creditLimit=creditLimit;
		this.currentDebt=currentDebt;
		this.interestRate=interestRate;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public double getCreditLimit() {
		return creditLimit;
	}
	
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public double getCurrentDebt() {
		return currentDebt;
	}
	
	public void setCurrentDebt(double currentDebt) {
		this.currentDebt = currentDebt;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void swipeCard(double amount) {
		if(amount>this.creditLimit) {
			System.out.println("Transcation Declined,Limit exceeded");
		}else {
			System.out.println("Increase CurrentDebited");
		}
	}
	
	public void makePayment(double amount) {
		if(amount>this.currentDebt) {
			System.out.println("Exceed Amount payment not Allowed");
		}
	}
	
	public void applyInterest() {
		this.currentDebt+=(this.currentDebt*(this.interestRate/100.0));
		System.out.println(this.currentDebt);
	}
}