package com.company;

public class Main {

    public static void main(String[] args) {

      Student student=new Student();
      student.setId(2018108131);
      student.setName("张广亮");
      student.setPassword("1111");
      student.setPhone("10086");
      student.setAddress("河池学院");
      student.setMajor("计算机科学与技术");
        System.out.println("学号:" + student.getId());
        System.out.println("姓名:" + student.getName());
        System.out.println("密码:" + student.getPassword());
        System.out.println("电话号码:" + student.getPhone());
        System.out.println("住址:" + student.getAddress());
        System.out.println("专业:" + student.getMajor());


    }
}
