package cn.edu.hcnu.Client;

public class Client {
    public static void main(String[] args) {
        Thread thread=new LoginThread();
        thread.start();


    }
}
