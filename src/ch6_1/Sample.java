package ch6_1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

//        byte[] a = new byte[3];
//        in.read(a);
//        System.out.println(a); // "abc"넣은 결과: [B@4e50df2e
//
//        char[] b = new char[3];
//        reader.read(b);
//        System.out.println(b); // "abc"넣은 결과: abc

//        String c = br.readLine();
//        System.out.println(c);

        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
        sc.close();
    }
}
