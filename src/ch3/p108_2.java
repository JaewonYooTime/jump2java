package ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class p108_2 {
    public static void main(String[] args){
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,3,5,4,2));
        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);
    }
}
