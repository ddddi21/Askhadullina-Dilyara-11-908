import java.awt.*;

public class Bus extends Car {
    protected double SitPlace;
    public Bus (Color color, String model, int maxSpeed, double power) {
        super(color, model, maxSpeed, power);
        this.SitPlace = SitPlace;
    }
    public Bus() {
        super();
        SitPlace = 40;
    }
}
