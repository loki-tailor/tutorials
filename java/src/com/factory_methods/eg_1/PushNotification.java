package com.factory_methods.eg_1;

/*-
    @date 14-05-21
    @ref: https://www.geeksforgeeks.org/factory-method-design-pattern-in-java/
*/

public class PushNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("sending a Push notification...");
    }
}