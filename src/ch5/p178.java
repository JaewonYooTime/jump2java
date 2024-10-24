package ch5;

class Animal4 {
    String name;

    void setName(String name){
        this.name = name;
    }
}

class Dog3 extends Animal4{
    void sleep(){
        System.out.println(this.name + " zzz");
    }
}

class HouseDog2 extends Dog3{
    HouseDog2(String name){
        this.setName(name);
    }
    HouseDog2(int type){
        if (type == 1) {
            this.setName("yorkshire");
        } else if(type == 2){
            this.setName("bulldog");
        }
    }

    void sleep(){
        System.out.println(this.name + " zzz in ch7_1.house");
    }

    void sleep(int hour){
        System.out.println(this.name + " zzz in ch7_1.house for " + hour + " hours");
    }
}

public class p178 {
    public static void main(String[] args){
        HouseDog2 dog0 = new HouseDog2("1");
        HouseDog2 dog1 = new HouseDog2(1);
        HouseDog2 dog2 = new HouseDog2(2);
        System.out.println(dog0.name);
        System.out.println(dog1.name);
        System.out.println(dog2.name);
    }
}
