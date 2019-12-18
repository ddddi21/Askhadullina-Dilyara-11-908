package extend;

import java.awt.*;

public class Bus extends Car {
    protected double sitPlace;
    public Bus(String color, String model, int maxSpeed, double power, double TrunkCapacity, Point point, double sitPlace) {
        super(color, model, maxSpeed, power, TrunkCapacity,point);
        this.sitPlace = sitPlace;
    }

    @Override
    public void Print(){
        super.Print();
        System.out.print(" SitPlace: " + sitPlace + " \n");
    }



    public Bus() {
        super();
        sitPlace = 40;
    }
}
