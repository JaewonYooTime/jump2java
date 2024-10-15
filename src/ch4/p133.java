package ch4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class p133 {
    public static void main(String[] args){
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one", "two", "three"));
        for (String number: numbers){
            System.out.println(number);
        }
    }
}
