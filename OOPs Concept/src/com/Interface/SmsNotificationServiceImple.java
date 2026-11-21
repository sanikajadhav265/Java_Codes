package com.Interface;

public class SmsNotificationServiceImple implements NotificationService1 {

	@Override
	public void send(String message) {
		System.out.println("Sms Notification Recieved: "+message);
	}

}
