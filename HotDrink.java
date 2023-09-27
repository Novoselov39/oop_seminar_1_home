package oop.seminar_1.oop_seminar_1_home;

public class HotDrink extends Product{

    private int temp;
    private int volume;

    public HotDrink(String name, double price, int temp, int volume) {
        super(name, price);
        this.temp=temp;
        this.volume=volume;
        
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    

    
}
