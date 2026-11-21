package com.Interface;

public class PushNotificationServiceImple implements NotificationService1{

	@Override
	public void send(String message) {
				System.out.println("Push Notification Recieved: "+message);
	}

}
