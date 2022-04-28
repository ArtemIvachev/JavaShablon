package com.company;
import java.util.*;

public class SetThread implements Runnable{
    private Set <Integer> _set;

    SetThread(Set <Integer> _set){
        this._set=_set;
    }
    @Override
    public void run() {
        synchronized (_set) { //синхронизируем потоки на сете
            for (int i = 1; i < 5; i++) _set.add(i);
            for (Object item :_set){
                System.out.println("set element : { key: " +item + " }" + " by " + Thread.currentThread().getName());
            }
        }
    }
}