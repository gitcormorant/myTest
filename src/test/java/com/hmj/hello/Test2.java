package com.hmj.hello;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author shkstart
 * @create 2019-09-01-16:57
 */
public class Test2 {
    public static void main(String[] args) {
        TicketTest t1=new TicketTest("1站台");
        TicketTest t2=new TicketTest("2站台");
        TicketTest t3=new TicketTest("3站台");
        Thread d1=new Thread(t1);
        Thread d2=new Thread(t2);
        Thread d3=new Thread(t3);
//        d1.start();
//        d2.start();
//        d3.start();
        ThreadPoolExecutor tpe=new ThreadPoolExecutor(3,10,0l, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<>());
                     tpe.execute(d1);
        ThreadPoolExecutor tpe2=new ThreadPoolExecutor(3,10,0l, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<>());
        tpe.execute(d2);
        ThreadPoolExecutor tpe3=new ThreadPoolExecutor(3,10,0l, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<>());
        tpe.execute(d3);
                     tpe.shutdown();
        tpe2.shutdown();
        tpe3.shutdown();
    }


}
