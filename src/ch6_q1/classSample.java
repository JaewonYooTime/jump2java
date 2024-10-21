package ch6_q1;

import java.util.Scanner;

public class classSample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요.");
        int first = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요.");
        int second = sc.nextInt();

        int result = first + second;
        System.out.printf("%d + %d = %d 입니다.", first, second, result);

    }
}
