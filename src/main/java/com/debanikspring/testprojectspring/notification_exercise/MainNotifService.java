package com.debanikspring.testprojectspring.notification_exercise;

import org.springframework.stereotype.Service;

@Service
public class MainNotifService {

    NotificationService notifService;
    public MainNotifService(NotificationService notifService){
        this.notifService=notifService;
    }

    public void sendNotif(String message){
        notifService.sendMessage(message);
    }
}
