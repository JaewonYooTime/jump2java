package ch3;

import java.util.HashMap;

public class p88_1 {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.containsKey("people"));
    }
}
