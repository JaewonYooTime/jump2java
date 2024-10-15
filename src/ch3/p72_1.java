package ch3;

public class p72_1 {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        sb.append("jump to java");
        sb.insert(0, "hello");
        System.out.println(sb.toString());
    }
}