package org.example.structural.tp;

import org.example.structural.tp.message.AlertMessage;
import org.example.structural.tp.message.InfoMessage;
import org.example.structural.tp.message.Message;
import org.example.structural.tp.message.PromotionMessage;
import org.example.structural.tp.sender.EmailSender;
import org.example.structural.tp.sender.NotificationSender;
import org.example.structural.tp.sender.PushSender;
import org.example.structural.tp.sender.SMSSender;

public class Demo {
    public static void main(String[] args) {
        NotificationSender emailSender = new EmailSender();
        NotificationSender smsSender = new SMSSender();
        NotificationSender pushSender = new PushSender();

        Message alertMessage = new AlertMessage(emailSender);
        Message promotionMessage = new PromotionMessage(smsSender);
        Message infoMessage = new InfoMessage(pushSender);

        alertMessage.sendMessage(); 
        promotionMessage.sendMessage();
        infoMessage.sendMessage();
    }
}

