package cn.edu.hcnu;

public class Test {
    public static void main(String[] args) {
        Animal animal=new Dog();
        System.out.println(animal.bark());
        Animal animal1=new Cat();
        System.out.println(animal1.bark());
    }
}
