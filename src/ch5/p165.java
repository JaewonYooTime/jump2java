package ch5;

public class p165 {
    int a; // 객체변수 a

    void varTest(p165 sample){
        sample.a++;
    }

    public static void main(String[] args){
        p165 sample = new p165();
        sample.a = 1;
        sample.varTest(sample);
        System.out.println(sample.a);
    }
}
