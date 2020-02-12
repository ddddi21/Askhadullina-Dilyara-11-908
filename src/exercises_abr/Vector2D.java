package exercises_abr;

public class Vector2D {
    protected double x;
    protected double y;

    public Vector2D () {
        this.x = 0;
        this.y = 0;
    }

    public Vector2D (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX () {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY () {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Vector2D add(Vector2D vector2D) {
        Vector2D vector_of_sum = new Vector2D(vector2D.x + getX(), vector2D.y + getY());
        return vector_of_sum;
    }

    public void add2(Vector2D vector2D) {
        setX(vector2D.x + getX());
        setY(vector2D.y + getY());
    }

    public Vector2D sub(Vector2D vector2D) {
        Vector2D vector_of_raznost = new Vector2D(getX() - vector2D.x,getY() - vector2D.y);
        return vector_of_raznost;
    }

    public void sub2(Vector2D vector2D) {
        setX(getX() - vector2D.x);
        setY(getY() - vector2D.y);
    }

    public Vector2D mult(double z) {
        Vector2D vector_of_mult = new Vector2D(getX() * z,getY() *z);
        return vector_of_mult;
    }

    public void mult2(double z) {
        setX(getX() * z);
        setY(getY() * z);
    }

    public String toString () {
        return (getX() + " " + getY());
    }

    public double length () {
        double length = Math.sqrt(getX()*getX() + getY()*getY());
        return (length);
    }

    public double cos(Vector2D vector2D) {

        return (this.scalarProduct(vector2D)/(this.length()*vector2D.length()));
    }

    public double scalarProduct(Vector2D vector2D) {
        return (getX()*vector2D.x +getY()*vector2D.y);
    }

    public boolean equals (Vector2D vector2D) {
        if ((getX() == vector2D.x) && (getY() == vector2D.y)) {
            return true;
        } else
            return  false;
    }

    public static void main(String[] args) {
        Vector2D vector = new Vector2D();
        Vector2D vector2 = new Vector2D();
        vector2.setX(2.0);
        vector2.setY(3.0);
        System.out.println("sum of vectors" + vector.add(vector2));
        System.out.println("before" + vector);
        vector.add2(vector2);
        System.out.println("after" + vector);
        System.out.println( "raznost of vectors " + vector.sub(vector2));
        System.out.println("before" + vector);
        vector.sub2(vector2);
        System.out.println("after" + vector);
        System.out.println("mult vector on 2" + vector. mult(2));
        System.out.println("before" + vector2);
        vector2.mult2(3.0);
        System.out.println("after" + vector2);
        System.out.println("strokovoe predstavlenie" + vector.toString());
        System.out.println("length of vector" + vector2.length());
        System.out.println("scalar" + vector.scalarProduct(vector2));
        System.out.println("cos between vectors" + vector.cos(vector2));
        System.out.println("ravenstvo of vector" + vector.equals(vector2));
    }
}
