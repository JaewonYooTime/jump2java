package ch5_q4;

import java.util.ArrayList;
import java.util.Arrays;

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

    int avg(ArrayList<Integer> data) {
        int result = 0;
        //for (int i = 0; i < data.toArray().length; i++){
            //result += data.get(i);
        //}
        for (int num: data){
            result += num;
        }
        return (result/data.size());
    }

    int avg(int[] data) {
        int result = 0;
        for (int i = 0; i < data.length; i++){
            result += data[i];
        }
        return (result/data.length);
    }
}

public class Sample {
    public static void main(String[] args){
        Calculator cal = new Calculator();

        ArrayList<Integer> data1 = new ArrayList<>(Arrays.asList(1,3,5,7,9));
        int result1 = cal.avg(data1);
        System.out.println(result1);
        System.out.println("------------");
        int[] data2 = {1,3,5,7,9};
        int result2 = cal.avg(data2);
        System.out.println(result2);

    }
}
