package oop.seminar_1.oop_seminar_1_home;

import java.util.List;

public class BottelofWaterVendingMachine implements VendingMachine {
    List<BottleofWater> productlist;
    
    @Override
    public Product getProduct(String name) {
        for (Product product : productlist) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public BottleofWater getProduct(String name, int volume) {
        for (BottleofWater bottleofWater : productlist) {
            if (bottleofWater.getName().equals(name) && bottleofWater.getVolume()==volume) {
                return bottleofWater;
            }
        }
        return null;  
    }


    public BottelofWaterVendingMachine(List<BottleofWater> productlist) {
        this.productlist = productlist;
    }


    public void setProductlist(List<BottleofWater> productlist) {
        this.productlist = productlist;
    }


    public List<BottleofWater> getProductlist() {
        return productlist;
    }

    public void addBottleofWater(BottleofWater bottleofWater){
        this.productlist.add(bottleofWater);
    }

    

    
    
}
