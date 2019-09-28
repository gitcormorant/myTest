package com.hmj.hello;

import static java.lang.Thread.sleep;

/**
 * @author shkstart
 * @create 2019-09-21-19:35
 */
public class TicketTest implements Runnable {
    private String name;

    public TicketTest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static int tick = 50;

    // 创建一个静态钥匙
    static Object ob = "aa";//值是任意的

    @Override
    public void run() {
          while (tick>0){
//              synchronized (ob){
                  if (tick>0) {
                      System.out.println(getName()+"卖出了第"+tick+"张票");
                      tick--;
                  }

//              }
              try {
                  sleep(1000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
    }


    public static void main(String[] args) {
           TicketTest t1=new TicketTest("1站台");
           TicketTest t2=new TicketTest("2站台");
           TicketTest t3=new TicketTest("3站台");
           Thread d1=new Thread(t1);
           Thread d2=new Thread(t2);
           Thread d3=new Thread(t3);
           d1.start();
           d2.start();
           d3.start();


    }
}
