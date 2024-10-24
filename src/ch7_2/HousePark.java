package ch7_2;

public class HousePark {
    String lastname = "park";
    protected String lastname2 = "park2";
    public String info = "this is public message";

    public static void main(String[] args){
        HouseKim kim = new HouseKim();
        System.out.println(kim.lastname);
    }
}
