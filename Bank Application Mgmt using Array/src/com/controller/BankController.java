package com.controller;
import java.util.Scanner;
import com.service.RBI;
import com.serviceimple.SBI;

public class BankController {

	public static void main(String[] args) {

		System.out.println("*******WEL-COME TO SBI********");
		System.out.println("______________________________");
		Scanner sc=new Scanner(System.in);
		RBI rbi= new SBI();
		boolean flag=true;
		while(flag) {
			System.out.println("*****************************");
			System.out.println("*****************************");
			System.out.println("1: Create Account          **");
			System.out.println("2: Show Account Details    **");
			System.out.println("3: Show Account Balance    **");
			System.out.println("4: Withdraw Money          **");
			System.out.println("5: Deposite Money          **");
			System.out.println("6: Update Account Details  **");
			System.out.println("7: Exit                    **");
			System.out.println("*****************************");
			System.out.println("*****************************");

			System.out.println("Enter Your Choice Before 1 to 7");
			int ch=sc.nextInt();   
			switch(ch) {
			case 1:
				rbi.createAccount();
				break;
			case 2:
				rbi.showAccountDetails();
				break;
			case 3:
				rbi.showAccountBalance();
				break;
			case 4:
				rbi.withdrawMoney();
				break;
			case 5:
				rbi.depositeMoney();
				break;
			case 6:
				rbi.updateAccountDeatils();
				break;
			case 7:
				flag=false;
				break;
			default:
				System.out.println("Enter Wrong Choice Please Enter Correct Choice !!");		   

			}
			System.out.println(" ");
			System.out.println("Thank You for Coming to Bank , Visit Again !!");
		}

	}
}



