package com.hillel.suraieva.homework14;

public class Main {
    public static void main(String[] args) {
        Androids phoneAndroid = new Androids();
        IPhones iphone = new IPhones();

        phoneAndroid.call();
        iphone.sms();
    }
}
