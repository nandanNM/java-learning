package com.codernandan.multithreading;

public class Test  {
    public static void main(String[] args) throws InterruptedException {
//        create new thread
//        World world = new World("t1");
//        world.start();
//        System.out.println(Thread.currentThread().getName());
//        create new thread new method

//        World2 world2 = new World2();
//        Thread t1 = new Thread(world2);
//        Thread.sleep(1000000); //  main thread sleep
//        t1.join(); // block thread fast run t1 thread than run main thread

//        World l = new World("thread-l");
//        World m = new World("thread-m");
//        World h = new World("thread-h");
//
//        l.setPriority(Thread.MIN_PRIORITY);
//        m.setPriority(Thread.NORM_PRIORITY);
//        h.setPriority(Thread.MAX_PRIORITY);

        World thread = new World("t-2");
        thread.start();
//        thread.interrupt(); //sleep interrupted: that you do stop that and throw interrupt
//    thread.setDaemon(true);
//        for(int i=0;i<10;i++){
//            System.out.println("Hello");
//        }
    }
}

// start run join sleep setPriority set-name set-Priority interrupt yield setDaemon

//DAEMON THREADS -> RUN IN BACKGROUND IF ALL USER THREAD IS OFF THEN JVM Terminate THE program  NOT waiting FOR THIS THREAD
