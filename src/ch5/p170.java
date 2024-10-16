package ch5;

class Animal2 {
    String name;

    void setName(String name){
        this.name = name;
    }
}

class Dog extends Animal2{
    void sleep(){
        System.out.println(this.name + " zzz");
    }
}

public class p170 {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
    }
}
