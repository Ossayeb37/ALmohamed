package org.example.structural.tp.sender;

public class EmailSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
