package ch4;

public class p128 {
    public static void main(String[] args){
        String[] numbers = {"one", "two", "three"};
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("---------");

        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
