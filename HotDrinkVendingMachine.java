package oop.seminar_1.oop_seminar_1_home;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    List<HotDrink> productlist;

    @Override
    public Product getProduct(String name) {
        for (Product product : productlist) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;                  
       
    }
    public HotDrink getProduct(String name, int volume, int temp) {
        for (HotDrink hotDrink : productlist) {
            if (hotDrink.getName().equals(name) && hotDrink.getTemp() == temp && hotDrink.getVolume() == volume) {
                return hotDrink;
            }
        }
        return null;                  
       
    }
    public HotDrinkVendingMachine(List<HotDrink> productlist) {
        this.productlist = productlist;
    }
    
    
}
