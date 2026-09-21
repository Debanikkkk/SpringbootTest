package com.debanikspring.testprojectspring.notification_exercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationSystem implements NotificationService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Email message is "+message);
    }
}
