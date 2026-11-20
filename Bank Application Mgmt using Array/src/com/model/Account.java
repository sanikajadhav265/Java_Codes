package com.model;

public class Account {

	private long accountNumber;
	private String accountname;
	private String panCard;
	private String aadharCard;
	private long contactNumber;
	private String emailId;
	private double accountBalance;

	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "Account Details:- \n accountNumber:-" + accountNumber + "\n accountname:-" + accountname + "\n panCard:-" + panCard
				+ "\n aadharCard:-" + aadharCard + "\n contactNumber:-" + contactNumber + "\n emailId:-" + emailId
				+ "\n accountBalance:-" + accountBalance + " ";
	}




}
