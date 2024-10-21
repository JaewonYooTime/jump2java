package ch6_q3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Sample {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("sample.txt");
        fw.write("Write once, run anywhere");
        fw.close();

        BufferedReader br = new BufferedReader((new FileReader("sample.txt")));
        String line = br.readLine();
        System.out.println(line);
    }
}
