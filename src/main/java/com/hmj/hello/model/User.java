package com.hmj.hello.model;

import javax.validation.Payload;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -3258839839160856613L;
    @NotEmpty(message = "姓名不能为空")
        private String name;

    @Max(value=88,message = "最大88")
    @Min(value=12,message = "不能小于18")
        private int  age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(@NotEmpty(message = "姓名不能为空") String name, @Max(value = 88, message = "最大88") @Min(value = 12, message = "不能小于18") int age) {
        this.name = name;
        this.age = age;
    }
}
