package ch3;

public class p108_1 {
    public static void main(String[] args){
        String a = "a:b:c:d";
        String b = a.replaceAll(":","#");
        System.out.println(b);
    }
}
