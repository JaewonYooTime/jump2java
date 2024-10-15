package ch3;

public class p84_1 {
    public static void main(String[] args){
        String[] pitches = new String[]{"138", "129", "142"};
        String result = String.join(",", pitches);
        System.out.println(pitches); // 배열의 주소가 출력됨
        System.out.println(result);
    }
}
