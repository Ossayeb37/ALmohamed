package org.example.structural.tp.message;

import org.example.structural.tp.sender.NotificationSender;

public class AlertMessage extends Message {
    public AlertMessage(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void sendMessage() {
        sender.send("Alert: Take immediate action!");
    }
}

