package org.example.structural.tp.message;

import org.example.structural.tp.sender.NotificationSender;

public abstract class Message {
    protected NotificationSender sender;

    public Message(NotificationSender sender) {
        this.sender = sender;
    }

    public abstract void sendMessage();
}
