import java.util.HashSet;
import java.util.Arrays;

public class p95_2{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.addAll(Arrays.asList("To", "Java"));
        System.out.println(set);
    }
}