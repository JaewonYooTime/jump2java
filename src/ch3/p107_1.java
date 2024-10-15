package ch3;

public class p107_1 {
    public static void main(String[] args){
        String pin = "881120-106834";
        String yyyyMMdd = "19"+pin.substring(0,6);
        String num = pin.substring((7));
        System.out.println(yyyyMMdd);
        System.out.println(num);
    }
}
