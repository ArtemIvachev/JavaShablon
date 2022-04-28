package com.company;
public class IThread implements Runnable {
    String name;

    IThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println("Name: " + name);
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
        }
    }
}