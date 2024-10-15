package ch3;

import java.util.HashMap;

public class p111 {
    enum CoffeePrice{
        AME,
        ICE_AME,
        CARA
    }
    static void printCoffeePrice(CoffeePrice type){
        HashMap<CoffeePrice, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeePrice.AME, 3000);
        priceMap.put(CoffeePrice.ICE_AME, 4000);
        priceMap.put(CoffeePrice.CARA, 5000);
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }

    public static void main(String[] args){
        printCoffeePrice(CoffeePrice.AME);
        //printCoffeePrice(99);
    }
}
