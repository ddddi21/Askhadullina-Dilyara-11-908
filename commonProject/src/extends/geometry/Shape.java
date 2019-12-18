package geometry;


public abstract class Shape {
    protected  String color;

    public Shape (String color) {
        this.color = color;
    }
    public Shape (){
        this.color = "black";
    }

    @Override
    public String toString() {
        return String.format("Shape of color is", this.color);
    }

     abstract public double getArea();
    abstract public  double getPerimeter();
}

class Rectangls extends Shape {
    protected  double height;
    protected double width;
    public Rectangls(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public double getPerimeter() {
        return (this.height + this.width) *2;
    }

    @Override
    public String toString () {
        return super.toString() + " " +
        this.getClass().getSimpleName() +
        String.format("height = %.2f"  + this.height+ " " +  " weight = %.2f" + this.width);
    }
}

class TestShape {
    public static  void main (String[] args) {
//        Shape shape = new Shape() { // нельзя получить параметр абстрактного класса
        Shape [] shape = new Shape[2];
        shape[0] = new Rectangls("red",10,10);
        shape [1] = new Circle(10, "red");
        for (Shape currentShape: shape) {
            System.out.print(currentShape);
            System.out.println(currentShape.getArea());
        }
    }
}

