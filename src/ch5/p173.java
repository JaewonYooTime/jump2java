package ch5;

class Animal3 {
    String name;

    void setName(String name){
        this.name = name;
    }
}

class Dog2 extends Animal3{
    void sleep(){
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog2{
    void sleep(){
        System.out.println(this.name + " zzz in ch7_1.house");
    }

    void sleep(int hour){
        System.out.println(this.name + " zzz in ch7_1.house for " + hour + " hours");
    }
}

public class p173 {
    public static void main(String[] args){
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep();
        houseDog.sleep(3);
    }
}
