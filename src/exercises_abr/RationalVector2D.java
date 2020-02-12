package exercises_abr;

public class RationalVector2D {
    protected RationalFraction x1;
    protected RationalFraction x2;

    public RationalFraction getX1() {
        return x1;
    }

    public RationalFraction getX2() {
        return x2;
    }

    public void setX1(RationalFraction x1) {
        this.x1 = x1;
    }

    public void setX2(RationalFraction x2) {
        this.x2 = x2;
    }

    public RationalVector2D() {
        x1.x = 0;
        x2.y = 0;
    }

    public RationalVector2D (RationalFraction fraction, RationalFraction fraction2) {
        x1 = fraction;
        x2 = fraction2;
    }

//    @Override
//    public String toString () {
//        toString() extends RationalFraction;
//    }

    public RationalVector2D add( RationalVector2D vector2D) {
         RationalVector2D vector = new RationalVector2D(this.x1.add(vector2D.x1), this.x2.add(vector2D.x2));
         return vector;
    }

    public double length() {
        return length();
    }
//
//    public RationalFraction scalarProduct (RationalVector2D vector2D) {
//        RationalFraction fraction = new RationalFraction(scalarProduct(vector2D));
//    }

}
