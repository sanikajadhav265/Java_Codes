package com.Interface;

public class AdminOfNotification {
	
	public static void main(String[] args) {
		NotificationService ns1=new EmailNotificationServiceImp();
		ns1.send("Your Order is Placed");
		
		NotificationService ns2=new WpNotificationServiceImp();
		ns2.send("Your Order Delivered at 9Am to 12Pm");
		
		NotificationService ns3=new SMSNotificationServiceImp();
		ns3.send("Use Below OTP to your Order 2609");
		
	}

}
