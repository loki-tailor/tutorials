package com.factory_methods.eg_1;

/*-
    @date 14-05-21
    @ref: https://www.geeksforgeeks.org/factory-method-design-pattern-in-java/
*/

public class NotificationFactory {
    
    // factory method helping in creating instances based on channel

    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty())
            return null;
        else if ("SMS".equals(channel))
            return new SMSNotification();
        else if ("EMAIL".equals(channel))
            return new EmailNotification();
        else if ("PUSH".equals(channel))
            return new PushNotification();
        else 
            return null;
    }
}