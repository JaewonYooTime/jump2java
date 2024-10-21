package ch5_q1;

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

class MaxLimitCalculator extends Calculator{
    void add(int val) {
        super.add(val);
        if (super.value > 100){
            super.value = 100;
        }
    }

    void minus(int val) {
        super.minus(val);
        if (super.value > 100){
            super.value = 100;
        }
    }
}

public class ch5_q1 {
    public static void main(String[] args){
        MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(50);
        cal.add(60);
        System.out.println(cal.getValue());
    }
}
