package ch3;

import java.util.ArrayList;
import java.util.Arrays;

public class p83_2 {
    public static void main(String[] args){
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = String.join(",", pitches);
        System.out.println(pitches);
        System.out.println(result);
    }
}
