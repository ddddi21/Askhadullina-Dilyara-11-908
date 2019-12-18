import java.awt.*;

public class Car {
    protected Color color;
    protected   String model;
    protected int maxSpeed;
    protected double power;

    public Car(Color color, String model, int maxSpeed, double power) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.power = power;
    }

    public Color getColor() {
        return color;
    }

    public double getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }
    public Car() {
        color = Color.black;
        model = "BMW";
        maxSpeed = 300;
        power = 100;
    }

}

