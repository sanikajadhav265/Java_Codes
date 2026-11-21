package com.Interface;

public class EmailNotificationServiceImple implements NotificationService1{

	@Override
	public void send(String message) {
		System.out.println("Email Notification Recievde: "+message);
	}

}
