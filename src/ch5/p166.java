package ch5;

public class p166 {
    int a; // 객체변수 a

    void varTest() {
        this.a++;
    }

    public static void main(String[] args){
        p166 sample = new p166();
        sample.a = 1;
        sample.varTest();
        System.out.println(sample.a);
    }
}
