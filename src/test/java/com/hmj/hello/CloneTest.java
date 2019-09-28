package com.hmj.hello;

/**
 * @author shkstart
 * @create 2019-09-20-10:52
 */
class CloneTest implements Cloneable {
    int num;
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest ct = new CloneTest();
        ct.num = 666;
        System.out.println(ct.num);
        CloneTest ct2 = (CloneTest) ct.clone();
        System.out.println(ct2.num);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
