package com.hmj.hello;

/**
 * @author shkstart
 * @create 2019-09-20-10:52
 */
public class CloneTest2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest ct = new CloneTest();
        ct.num = 666;
        System.out.println(ct.num);
        CloneTest ct2 = (CloneTest) ct.clone();
        System.out.println(ct2.num);
    }
}
