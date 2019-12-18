package geometry;

import javafx.scene.shape.Cylinder;

public class Shape_1 {
}
    class Circle extends Shape {
        private double radius;
        private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle (double radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = 0;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * this.getRadius() * this.getRadius();
    }

        @Override
        public double getPerimeter() {
            return 0;
        }

        @Override
    public String toString() {
        return String.format("Circle [radius = %.2f]%n", this.getRadius());

    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(1.2);
        System.out.println(circle);
        Cilindre cyl = new Cilindre(1.23, 10);
        System.out.println(cyl);
        //upcasting
        Object c2 = new Cylinder(1.23, 12);
        System.out.println(c2);
        Circle c3 = new Cilindre(0.23,32);
        Circle c = (Cilindre) c3;
    }
        public static void draw(Circle circle) {
            if (circle instanceof  Cilindre) {
                Cilindre cy = (Cilindre) circle;
            }
        }


}
