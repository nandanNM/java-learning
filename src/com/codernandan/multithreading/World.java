package com.codernandan.multithreading;

public class World extends  Thread{
    public World(String name) {
        super(name);
    }
    @Override
    public void run() {
//        try {
//            Thread.sleep(1000);
//            System.out.println("Thread is running");
//        } catch (InterruptedException e) {
//            System.out.println("Thread interrupted:" + e);
//        }
        for(int i=0;i<10;i++){
            System.out.println("World");
            System.out.println(Thread.currentThread().getName());
            Thread.yield();// one work is done than chance another thread to work
        }
    }
}
