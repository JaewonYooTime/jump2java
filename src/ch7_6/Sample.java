package ch7_6;
import java.util.function.BiFunction;
interface Calculator{ // BiFunction 인터페이스 사용 시 Calculator 인터페이스가 필요없다.
    int sum(int a, int b);
}

class MyCalculator implements Calculator{ // 람다 사용 시 필요없음
    public int sum(int a, int b){
        return a+b;
    }
}

public class Sample {
    public static void main(String[] args){
        Calculator mc = new MyCalculator();
        int result = mc.sum(3,4);
        System.out.println(result);

        Calculator mc2 = (a,b) -> a + b;
        int result2 = mc2.sum(3,4);
        System.out.println(result2);

        Calculator mc3 = Integer::sum;
        int result3 = mc3.sum(3,4);
        System.out.println(result3);

        BiFunction<Integer, Integer, Integer> mc4 = (a,b) -> a+b;
        int result4 = mc4.apply(3,4);
        System.out.println(result4);


    }
}
