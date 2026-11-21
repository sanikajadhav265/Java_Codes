package com.Interface;

public class NotificationAdmin {
	
	public static void main(String[] args) {
		NotificationService1 n1=new EmailNotificationServiceImple();
		n1.send("Order Confirmed, Thank You for Shopping With Us....");
		System.out.println();
		NotificationService1 n2=new WhatsAppNotificationServiceImple();
		n2.send("Your Order Delivered At 9Am to 12Pm");
		System.out.println();
		NotificationService1 n3=new SmsNotificationServiceImple();
		n3.send("Your OTP is 2609");
		System.out.println();
		NotificationService1 n4=new PushNotificationServiceImple();
		n4.send("Your Order Delieverd!!");
	}

}
