package oop.seminar_1.oop_seminar_1_home;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BottleofWater> listproduct = new ArrayList<>();
        List<HotDrink> listproductHotDrink = new ArrayList<>();        
        listproduct.add(new BottleofWater("oopsem", 7,2 ));
        listproduct.add(new BottleofWater("ooplec", 7,1 ));
        listproduct.add(new BottleofWater("oophomvork", 5,4 ));
        listproduct.add(new BottleofWater("oopjava", 20,100 ));
        listproduct.add(new BottleofWater("tets", 11,5 ));
        listproductHotDrink.add(new HotDrink("coffe", 10, 30, 100));
        listproductHotDrink.add(new HotDrink("latte", 13, 40, 300));
        listproductHotDrink.add(new HotDrink("choc", 100, 50, 200));

        BottelofWaterVendingMachine vendingMachine = new BottelofWaterVendingMachine(listproduct);
        HotDrinkVendingMachine vendingMachineHotDrink = new HotDrinkVendingMachine(listproductHotDrink);
        // System.out.println(vendingMachine.getProduct("oopsem"));
        // System.out.println(vendingMachine.getProduct("oopsem", 1));
        System.out.println(vendingMachineHotDrink.getProduct("coffe",100, 30));
        System.out.println(vendingMachineHotDrink.getProduct("coffe"));


        
    }
}
