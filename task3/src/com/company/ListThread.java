package com.company;

import java.util.List;
import java.util.concurrent.locks.Lock;

public class ListThread implements Runnable {
    private List<String> _list;
    private Lock lock;

    ListThread(List<String> _list, Lock _lock){
        this._list=_list;
        this.lock=_lock;
    }

    @Override
    public void run() {
        lock.lock();//ограничиваем поток
        for (int i = 1; i < 5; i++) _list.add(i+"");
        for (Object item : _list) { //вывод по list
            System.out.println("list element : { key: " + item + " }" + " by " + Thread.currentThread().getName());
        }
        lock.unlock(); //открываем доступ
    }
}