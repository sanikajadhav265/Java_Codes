package com.Interface;

public class EmailNotificationServiceImp implements NotificationService {

	@Override
	public void send(String message) {
		System.out.println("Email Recieved:"+message);
		
	}

}
