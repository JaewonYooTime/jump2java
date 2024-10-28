package ch8_4;

public class Problem3 {
    static int getDigitCount(int n){
        int count = 0;
        while (true){
            if ( n ==0 ){
                break;
            }
            n = n / 10;
            count ++;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(getDigitCount(3));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(1234));
        System.out.println(getDigitCount(12345));
    }
}
