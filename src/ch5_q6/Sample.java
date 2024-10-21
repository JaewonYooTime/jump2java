package ch5_q6;

class Calculator {
    Integer value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue(){
        return this.value;
    }
}

public class Sample {
    public static void main(String[] args){
        Calculator cal = new Calculator();
        cal.add(3);
        System.out.println(cal.getValue());
    }
}
