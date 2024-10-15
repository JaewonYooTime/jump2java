package ch3;

import java.util.ArrayList;
import java.util.Arrays;

public class p82_1 {
    public static void main(String[] args){
        String[] data = {"138", "129", "142"}; // 이미 투구 수 데이터 배열이 있다.
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches);
    }
}
