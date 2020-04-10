package com.itgaoshu.demo2.bean;

public class N_user {
    private int u_id;
    private String uname;
    private int age;

    public int getU_id() {
        return u_id;
    }

    @Override
    public String toString() {
        return "N_user{" +
                "u_id=" + u_id +
                ", uname='" + uname + '\'' +
                ", age=" + age +
                '}';
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
