package com.lexiang.wlutils.netty;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.msgpack.annotation.Message;


@Message
public class User {

    private String name;

    private String sex;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}