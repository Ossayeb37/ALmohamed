package org.example.structural.tp.sender;

public class SMSSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
