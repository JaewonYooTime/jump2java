package ch3;

import java.util.ArrayList;

public class p80 {
    public static void main(String[] args){
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");

        String one = (String) pitches.get(0);
        String two = (String) pitches.get(1);
        System.out.println(one);
        System.out.println(two);
        System.out.println(pitches);
    }
}
