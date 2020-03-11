package TRRR;

public class Rb_tr {
    protected double a;
    protected double b;
    protected double c;
    protected double p;
    protected double s;
    protected double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Rb_tr(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getP() {
        return p;
    }

    public double getS() {
        return s;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setP(double p) {
        this.p = p;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double sides () {
        if (a==b)
            setBase(c);
        else if (a == c)
            setBase(b);
        else if (b==c)
            setBase(a);
            else  {
                System.out.println("triangles not r/b");
        }
        return base;
    }

    public double per() {
        setP(a + b + c);
        return p;
    }

    public double pl() {
        double r = per()/2 ;
        setS(Math.sqrt(r * (r - a) * (r - b) * (r - c)));
        return s;
    }


    public boolean equals (Rb_tr tr) {
        if (this.pl() == tr.pl()) {
            return true;
        }
        else return  false ;
    }

    public double[] an () {
        double h =  2 * (this.pl() /this.sides());
        double half_base =  this.sides() / 2;
        double cos = half_base / h;
        double [] aa = {Math.acos(cos),Math.acos(cos), 1.57 - Math.acos(cos) };
        return aa;
    }

    @Override
    public String toString () {
        double [] an2 = an();
        String answer = an2[0] + " " + an2[1] + " " + an2[2] + " ";
        return (answer);
    }

}
