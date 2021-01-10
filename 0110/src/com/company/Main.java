package com.company;

public class Main {

    public static void main(String[] args) {

        student s=new student();
        s.setId(2018108106);
        s.setStuname("黄启峰");
        s.setPassword("2018108106");
        s.setPhone("10086");
        s.setAddress("河池学院");
        System.out.println("学号为："+s.getId());
        System.out.println("学生姓名为："+s.getStuname());
        System.out.println("密码为："+s.getPassword());
        System.out.println("电话号码为："+s.getPhone());
        System.out.println("住址为："+s.getAddress());




    }
}
