package ch5_q3;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    void minus(int val) {
        this.value -= val;
    }

    boolean isOdd(int val){
        if (val % 2 == 0){
            return false;
        } else {
            return true;
        }
    }


    int getValue(){
        return this.value;
    }
}

public class Sample {
    public static void main(String[] args){
        Calculator cal = new Calculator();
        System.out.println(cal.isOdd(3));
        System.out.println(cal.isOdd(4));
    }
}
