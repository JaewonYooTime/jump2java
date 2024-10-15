package ch3;

import java.util.HashMap;

public class p87_2 {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("people", "사람");
        System.out.println(map.get("people"));
    }
}
