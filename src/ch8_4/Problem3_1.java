package ch8_4;

public class Problem3_1 {

    static int getDigitCount(int n){
        String s = ""+n;
        return s.length();
    }

    public static void main(String[] args){
        System.out.println(getDigitCount(3));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(1234));
        System.out.println(getDigitCount(12345));
    }
}
