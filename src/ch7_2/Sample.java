package ch7_2;

import ch7_2.HousePark;

public class Sample {
    private String secret;
    private String getSecret(){
        return this.secret;
    }

    public static void main(String[] args){
        HousePark housePark = new HousePark();
        System.out.println(housePark.info);
    }
}
