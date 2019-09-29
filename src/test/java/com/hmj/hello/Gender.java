package com.hmj.hello;

/**
 * @author shkstart
 * @create 2019-09-28-16:23
 */
public enum Gender {
    MAN("MAN"), WOMEN("WOMEN");

    private final String value;

    //构造器默认也只能是private, 从而保证构造函数只能在内部使用
    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
