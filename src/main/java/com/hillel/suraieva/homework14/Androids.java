package com.hillel.suraieva.homework14;

public class Androids implements Smartphones, LinuxOS{
    @Override
    public void call() {
        System.out.println("call android");
    }

    @Override
    public void sms() {
        System.out.println("sms android");
    }

    @Override
    public void internet() {
        System.out.println("internet android");
    }

    @Override
    public void linuxOS() {
        System.out.println("turned linuxOS");
    }
}
