package com.company;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        List<String> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        new Thread(new ListThread(list,lock)).start();
        new Thread(new ListThread(list,lock)).start();
        new Thread(new ListThread(list,lock)).start();
       // new Thread(new SetThread(set)).start();
       // new Thread(new SetThread(set)).start();
       // new Thread(new SetThread(set)).start();
    }
}