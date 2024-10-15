package ch5;

class Calculator0 {
    static int result = 0;

    static int add(int num){
        result += num;
        return result;
    }
}

public class p141 {
    public static void main(String[] args){
        System.out.println(Calculator0.add(3));
        System.out.println(Calculator0.add(4));
    }

}