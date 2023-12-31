package oop.seminar_1.oop_seminar_1_home;

public class BottleofWater extends Product {

    private int volume;
    public BottleofWater(String name, double price, int volume) {
        super(name, price);
        this.volume=volume;        
    }
    
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleofWater [" + 
        "name = " + super.getName() +
        ", price = " + super.getPrice()+
        ", volume = " + volume + "]";
    }


    
      
}
