package com.debanikspring.testprojectspring.notification_exercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("sms")
@Primary
public class SMSNotificationSystem implements NotificationService{
public void sendMessage(String message){
    System.out.println("SMS message is "+message);
}
}
