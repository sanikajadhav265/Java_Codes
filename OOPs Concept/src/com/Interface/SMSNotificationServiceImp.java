package com.Interface;

public class SMSNotificationServiceImp implements NotificationService {

	@Override
	public void send(String message) {
		System.out.println("SMS Recieved:"+message);
		
	}

}
