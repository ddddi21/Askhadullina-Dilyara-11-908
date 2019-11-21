package extend;

import extend.Bus;

import java.awt.*;
import java.sql.SQLOutput;

public class TrolleyBus extends Bus {
    protected  boolean electric;
    public TrolleyBus(String color, String model, int maxSpeed, double power, double TrunkCapacity, Point point, double sitPlace, boolean electric) {
        super(color, model, maxSpeed, power, TrunkCapacity, point, sitPlace);
    }
    public TrolleyBus () {
        super();
        this.electric = true;
    }

    @Override
    public void Print(){
        super.Print();
        System.out.print("Use: " + electric + " \n");

    }

}
