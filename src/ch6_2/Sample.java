package ch6_2;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Sample {
    public static void main(String[] args) throws IOException {
//        FileOutputStream output = new FileOutputStream("out.txt");
        FileWriter fw = new FileWriter("out.txt");
//        PrintWriter pw = new PrintWriter("out.txt");
        for (int i = 1; i< 11; i++){
            String data = i + " 번째 줄입니다.\r\n";
            fw.write(data);
        }
        fw.close();

        FileWriter fw2 = new FileWriter("out.txt", true);
        for (int i =11; i< 21; i++){
            String data = i + " 번째 줄입니다.\r\n";
            fw2.write(data);
        }
        fw2.close();
    }
}
