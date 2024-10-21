package ch6_q2;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args){
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("영어 문장을 입력하세요.");
            String line = sc.nextLine();
            if ("END".equals(line)){
                break;
            }
            System.out.println(line.toUpperCase());
        }
    }
}
