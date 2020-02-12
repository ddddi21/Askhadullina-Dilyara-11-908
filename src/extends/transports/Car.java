package extends_s.transports;

import java.awt.*;
import java.util.Scanner;

public class Car {
    protected String color;
    protected   String model;
    protected int maxSpeed;
    protected double power;
    protected double TrunkCapacity;
    protected Point point = new  Point(0,0);
    Scanner sc = new Scanner(System.in);


    public Car(String color, String model, int maxSpeed, double power,double TrunkCapacity, Point point) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.power = power;
        this.point = point;
        this.TrunkCapacity = TrunkCapacity;
    }

    public String getColor() {
        return color;
    }

    public double getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public  double  getTrunkCapacity() {
        return TrunkCapacity;
    }

    public Point getPoint() {
        return point;
    }

    public String getModel() {
        return model;
    }

//    public void setColor( Color color) {
//        this.color = color.white;
//    }

    public void setColor () {
        String s = sc.nextLine();
        color = s;
    }
    public Car() {
        color = "black";
        model = "BMW";
        maxSpeed = 300;
        power = 100;
        TrunkCapacity = 32;
        point.x = 3;
        point.y = 4;
    }

    public void Print () {
        System.out.print("model:"+ model + " "+ "color:" + color + " " + "maxSpeed:"+ maxSpeed + " " + "power" + power + " " + "TC:" + TrunkCapacity + " " +  "(x,y):" + point);
    }

    public void Move (int x, int y) {
        point.x += x;
        point.y += y;
    }
}
