package com.factory_methods.eg_1;

/*-
    @date 14-05-21
    @ref: https://www.geeksforgeeks.org/factory-method-design-pattern-in-java/
*/

public class NotificationService {
    public static void main(String... args) {
        System.out.println("started");
        NotificationFactory nf = new NotificationFactory();
        Notification n = nf.createNotification("PUSH");
        n.notifyUser();
        System.out.println("ended");
    }
}