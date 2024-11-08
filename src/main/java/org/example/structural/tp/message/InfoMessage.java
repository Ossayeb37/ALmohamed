package org.example.structural.tp.message;

import org.example.structural.tp.sender.NotificationSender;

public class InfoMessage extends Message {
    public InfoMessage(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void sendMessage() {
        sender.send("Info: Here's some useful information.");
    }
}
