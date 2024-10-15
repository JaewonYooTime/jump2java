package ch5;

public class p164 {
    int vatTest(int a){
        a++;
        return a;
    }

    public static void main(String[] args){
        int a = 1;
        p164 sample = new p164();
        a = sample.vatTest(a);
        System.out.println(a);
    }
}
