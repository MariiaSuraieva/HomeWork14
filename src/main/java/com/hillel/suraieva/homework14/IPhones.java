package com.hillel.suraieva.homework14;

public class IPhones implements Smartphones, IOS{
    @Override
    public void call() {
        System.out.println("call iPhone");
    }

    @Override
    public void sms() {
        System.out.println("sms iPhone");
    }

    @Override
    public void internet() {
        System.out.println("internet iPhone");
    }

    @Override
    public void iOs() {
        System.out.println("turned iOS");
    }
}
