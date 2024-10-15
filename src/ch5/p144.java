package ch5;

class Calculator {
    int result = 0;

    int add(int num) {
        result += num;
        return result;
    }
}

public class p144 {
    public static void main(String[] args){
        Calculator cal1 = new Calculator(); // 계산기1 객체를 생성한다.
        Calculator cal2 = new Calculator(); // 계산기2 객체를 생성한다.

        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));

        System.out.println(cal2.add(3));
        System.out.println(cal2.add(7));
    }
}
