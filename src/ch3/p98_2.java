package ch3;

public class p98_2 {
    enum CoffeeType{
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    public static void main(String[] args){
        for(CoffeeType type: CoffeeType.values()) {
            System.out.println(type);
        }
    }
}
