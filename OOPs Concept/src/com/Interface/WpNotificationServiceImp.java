package com.Interface;

public class WpNotificationServiceImp implements NotificationService {

	@Override
	public void send(String message) {
		System.out.println("WhatsApp Recieved:"+message);
		
	}

}
