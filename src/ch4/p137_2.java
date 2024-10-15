package ch4;

public class p137_2 {
    public static void main(String[] args){
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int total = 0;
        for (int mark: marks){
            total += mark;
        }
        float average = (float) total/marks.length;
        System.out.println(average);
    }
}
