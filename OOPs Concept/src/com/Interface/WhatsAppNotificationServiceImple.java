package com.Interface;

public class WhatsAppNotificationServiceImple implements NotificationService1 {

	@Override
	public void send(String message) {
		System.out.println("WhatsApp Notification Recieved: "+message);
		
	}

}
