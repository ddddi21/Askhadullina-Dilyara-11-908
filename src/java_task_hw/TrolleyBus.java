import java.awt.*;

public class TrolleyBus extends Bus {
    protected  boolean electric;
    public TrolleyBus (Color color,  String model, int maxSpeed, double power) {
        super(color, model, maxSpeed, power);
        this.electric = electric;
    }

}
