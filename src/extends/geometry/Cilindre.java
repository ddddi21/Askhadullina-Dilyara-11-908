package extends_s.geometry;

public class Cilindre extends Circle {
    private double heigth;

    public Cilindre(double radius){
        super(radius);

    }

    public Cilindre(){
        super();
    }

    public Cilindre(double radius, double heigth){
        super(radius);
        this.heigth = heigth;
    }

    public double getHeigth(){
        return this.heigth;
    }

    @Override
    public double getArea(){
        return (2 * super.getArea() + 2 * Math.PI * getHeigth() * getRadius());
    }

    public double getVolume(){
        return super.getArea() * this.getHeigth();
    }

    @Override
    public String toString(){
        return String.format("Cylinder [height = %.2f] [Volume = %.2f] %n%s", this.getHeigth(),this.getVolume(), super.toString());
    }
}
