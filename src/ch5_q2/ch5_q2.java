package ch5_q2;

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

    int getValue(){
        return this.value;
    }
}

public class ch5_q2 {
    public static void main(String[] args){
        Calculator cal = new Calculator();
        cal.add(10);
        cal.minus(3);
        System.out.println(cal.getValue());
    }
}
