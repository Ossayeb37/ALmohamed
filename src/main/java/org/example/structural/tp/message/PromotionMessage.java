package org.example.structural.tp.message;

import org.example.structural.tp.sender.NotificationSender;

public class PromotionMessage extends Message {
    public PromotionMessage(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void sendMessage() {
        sender.send("Promotion: Special offer just for you!");
    }
}
