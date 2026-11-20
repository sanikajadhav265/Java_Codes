package com.serviceimple;

import java.util.Scanner;

import com.Exception.InsufficientAccountBalanceException;
import com.model.Account;
import com.model.AccountLimit;
import com.model.Validator;
import com.service.RBI;

public class SBI implements RBI {
	Account[] acc1 = new Account[AccountLimit.MAX_length];

	// Account[] acc1=new Account[5];
	Scanner sc = new Scanner(System.in);

	@Override
	public void createAccount() {
		System.out.println("How Many Account Creates?");
		int n = sc.nextInt();
		System.out.println(" ");
		if (n <= 5) {
			for (int i = 0; i < n; i++) {
				Account acc = new Account();
				int acno = (int) (Math.random() * Math.pow(10, 9));
				System.out.println("Enter Account No:");
				// acc.setAccountNumber(sc.nextLong());
				System.out.println("Account No:" + acno);
				acc.setAccountNumber(acno);
				System.out.println("Enter Name:");
				acc.setAccountname(sc.next());
				System.out.println("Enter PanCard No:");
				acc.setPanCard(sc.next());
				System.out.println("Enter AadharCard No:");
				acc.setAadharCard(sc.next());
				// System.out.println("Enter Mobile No:");
				// acc.setContactNumber(sc.nextLong());
				acc.setContactNumber(Validator.validateMobNo());
				System.out.println("Enter Email Id:");
				acc.setEmailId(sc.next());
				System.out.println("Enter Account Balance:");
				acc.setAccountBalance(sc.nextDouble());
				acc1[i] = acc;
				System.out.println("Account Created Successfully!" + "\n" + acc + " " + i + " Index");
				System.out.println(" ");
			}
		} else {
			System.out.println("Limit Exceeded For Account Creation!!");
		}
	}

	@Override
	public void showAccountDetails() {
		for (Account account : acc1) {
			if (account != null) {
				System.out.println(account);
				System.out.println(" ");
			}
		}
	}

	@Override
	public void showAccountBalance() {
		boolean flag = true;
		while (flag) {
			System.out.println("Enter Account NO. From whose Accounts User wants to Show Account Balance:");
			long checkAccountNo = sc.nextLong();
			boolean found = false;
			for (Account account : acc1) {
				if (account != null && account.getAccountNumber() == checkAccountNo) {
					System.out.println("Account Balance:" + account.getAccountBalance() + "RS");
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("Invalid Account Number");
			}
			System.out.println("Check Another Account Balance enter 1 otherwise 0");
			int choice = sc.nextInt();
			if (choice == 0) {
				flag = false;
			}
		}
	}

	@Override
	public void withdrawMoney() {
		boolean flag = true;
		while (flag) {
			System.out.println("In withdraw Method:");
			System.out.println("Enter Account NO. From whose Accounts User wants to Withdraw Amount:");
			long accountNo = sc.nextLong();
			System.out.println("Enter Withdraw Amount:");
			double withdrawamount = sc.nextDouble();
			double updatedBalance = 0;
			boolean flag1 = false;
			for (Account acc : acc1) {
				if (acc != null && acc.getAccountNumber() == accountNo) {
					try {
						if (acc.getAccountBalance() >= withdrawamount) {
							updatedBalance = acc.getAccountBalance() - withdrawamount;
							acc.setAccountBalance(updatedBalance);
							System.out.println("SuccessFully withdraw the Amount of Rs:" + withdrawamount);
							System.out.println("Updated amount for:" + updatedBalance);
							flag1 = true;
							break;
						} else {
							// System.out.println("Insufficient Amount in:"+acc.getAccountname()+"s account:");
							throw new InsufficientAccountBalanceException("Insufficient Account Balance");
						}
					} catch (Exception e) {
						System.out.println(e);
					}
					if (!flag1) {
						System.out.println("Invalid Account Number");
					}
					System.out.println("Check Another Account Balance enter 1 otherwise 0");
					int choice = sc.nextInt();
					if (choice == 0) {
						flag = false;
					}
				}
			}
		}
	}

	@Override
	public void depositeMoney() {
		boolean flag = true;
		while (flag) {
			System.out.println("In Deposit Method");
			System.out.println("Enter Account NO. From whose Accounts User wants to Deposit Amount:");
			long accountNo = sc.nextLong();
			System.out.println("Enter Deposit Amount:");
			double depositAmount = sc.nextDouble();
			boolean amount = true;
			for (Account acc : acc1) {
				if (acc != null && acc.getAccountNumber() == accountNo) {
					double updatedBalance = acc.getAccountBalance() + depositAmount;
					acc.setAccountBalance(updatedBalance);
					System.out.println("Successfully Deposited Rs. " + depositAmount);
					System.out.println("Updated Balance: " + updatedBalance);
					amount = true;
					break;
				}
			}
			if (!amount) {
				System.out.println("Invalid Account Number");
			}
			System.out.println("Check Another Account Balance enter 1 otherwise 0");
			int choice = sc.nextInt();
			if (choice == 0) {
				flag = false;
			}

		}
		System.out.println("Account Not Found.");
	}

	@Override
	public void updateAccountDeatils() {
		System.out.println("Update Account Details:");
		boolean flag = true;
		System.out.println("Enter Account No.From whose Accounts User wants to Update:");
		long accountNo = sc.nextLong();
		for (Account acc : acc1) {
			if (acc != null && acc.getAccountNumber() == accountNo) {
				while (flag) {
					System.out.println("*********************************");
					System.out.println("1. Update Name				    *");
					System.out.println("2. Update Mobile Number	    	*");
					System.out.println("3. Update Mail Id		    	*");
					System.out.println("4. Exit						    *");
					System.out.println("********************************");

					System.out.println("Enter Your Choice:");
					int ch = sc.nextInt();
					switch (ch) {
					case 1:
						System.out.println("Enter New Name:-");
						String newName = sc.next();
						acc.setAccountname(newName);
						String updatedName = acc.getAccountname();
						System.out.println("Name Updated Successfully to " + updatedName);
						break;
					case 2:
						// System.out.println("Enter New Mobile No = ");
						// acc.setAccountNumber(sc.nextInt());
						// long updateNumber=acc.getAccountNumber();
						acc.setContactNumber(Validator.validateMobNo());
						System.out.println("Number Updated Successfully to " + acc.getContactNumber());
						break;

					case 3:
						System.out.println("Enter New Mail Id:- ");
						String newMail = sc.next();
						acc.setEmailId(newMail);
						String updatedMail = acc.getEmailId();
						System.out.println("Email Id Updated Successfully to " + updatedMail);
						break;
					case 4:
						flag = true;
						break;

					default:
						System.out.println("Enter Valid Choice!!");
						break;
					}
				}
			} else {
				System.out.println("----- This account Doesn't Exist!!!!!! -----");

			}
		}
	}
}
