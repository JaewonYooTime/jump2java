package ch5;

public class ch5_3 {
    int sum(int a, int b){
        return a+b;
    }

    void varTest(int a){
        a++;
    }

    public static void main(String[] args){
        ch5_3 sample = new ch5_3();
        int c = sample.sum(3,4);
        System.out.println(c);


        // 163page
        int a = 1;
        ch5_3 sample163 = new ch5_3();
        sample163.varTest(a);
        System.out.println(a);

    }
}
