package matem;


import com.sun.javaws.IconUtil;

public class RationalFraction {
    protected int x;
    protected int y;

    public int getX() {
        return x;
    }

    public int getY () {
        return y;
    }

    public int setX (int x) {
         return this.x = x;
    }

    public int setY (int y) {
        return this.y = y;
    }

    public RationalFraction() {
        x = 0;
        y = 0;
    }

    public RationalFraction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString () {
        return (x + "/" + y);
    }


    public int min () {
        int min = x;
        if (x<y) {
            min = x;
        } else if (y<x) {
            min = y;
        }
        return min;
    }

    public int max() {
        int max = x;
        if (x>y) {
            max = x;
        } else if (y>x)  {
            max = y;
        }
        return max;
    }

    public void reduce() {
        int nok= 0;
        int max_nok = 0;
        min();
        for (int i = 1; i <= min(); i++) {
            if ((x % i == 0) & (y % i == 0 )) {
                nok = i;
                if (nok>max_nok) {
                    max_nok = nok;
                }
            }
            if ( max_nok == 0) {
                max_nok = 1;
            }
        }
        setX(x/max_nok);
        setY(y/max_nok);
    }

    public int add_all (RationalFraction fraction) {
        int nod = this.y * fraction.y;
        int min_nod = this.y * fraction.y;
        for (int i = max(); i < nod ; i++) {
            if ((i % this.y== 0) && (i % fraction.y == 0)) {
                nod = i;
                if ( nod < min_nod) {
                    min_nod = nod;
                }
                nod = this.y * fraction.y;
            }
        }
        if (min_nod == this.y * fraction.y) {
            setX(this.x * fraction.y);
            fraction.x = fraction.x * this.y;
            setY(min_nod);
            fraction.y = min_nod;
        } else {
            setX(this.x * (min_nod/this.y));
            setY(min_nod);
            fraction.x = fraction.x * (min_nod / fraction.y);
            fraction.y = min_nod;
        }
        return min_nod;
    }

    public RationalFraction add(RationalFraction fraction) {
        int min_nod = add_all(fraction);
        RationalFraction sum = new RationalFraction(this.x + fraction.x, min_nod);
        sum.reduce();
        return sum;
    }

    public void add2 (RationalFraction fraction) {
        setX(add(fraction).x);
        setY(add(fraction).y);
    }

    public RationalFraction sub (RationalFraction fraction) {
        int zn = add_all(fraction);
        int x1 = this.x;
        int x2 = this.x;
        if(this.x > fraction.x) {
            x1 = this.x;
            x2 = fraction.x;
        } else if (fraction.x > this.x) {
            x1 = fraction.x;
            x2 = this.x;
        }
        RationalFraction raz = new RationalFraction((x1 - x2), zn);
        raz.reduce();
        return raz;
    }

    public void sub2 (RationalFraction fraction) {
        setX(sub(fraction).x);
        setY(sub(fraction).y);
    }

    public RationalFraction mult(RationalFraction fraction) {
        RationalFraction mult_rez = new RationalFraction((this.x * fraction.x), (this.y * fraction.y));
        mult_rez.reduce();
        return mult_rez;
    }

    public void mult2 (RationalFraction fraction) {
        setX(mult(fraction).x);
        setY(mult(fraction).y);
    }

    public RationalFraction div(RationalFraction fraction) {
        RationalFraction div_rez = new RationalFraction((this.x * fraction.y), (this.y * fraction.x));
        div_rez.reduce();
        return div_rez;
    }

    public void div2(RationalFraction fraction) {
        setY(div(fraction).y);
        setX(div(fraction).x);
    }

    public double value() {
        return 1.0 * x / y;
    }

    public boolean equals (RationalFraction fraction) {
        this.reduce();
        fraction.reduce();
        if ((this.x == fraction.x) && (this.y == fraction.y)) {
            return true;
        } else
            return false;
    }

    public int numberPart() {
        int  w= (int)value();
         return w;
    }


    public static void main (String [] args) {
        RationalFraction fraction = new RationalFraction(1,9);
        RationalFraction fraction2 = new RationalFraction(1,1);
//        fraction.reduce();
//        System.out.println(fraction);
//        System.out.println(fraction.add(fraction2));
//        fraction.add2(fraction2);
//        System.out.println(fraction);
//        System.out.println(fraction.sub(fraction2));
//        fraction2.sub2(fraction);
//        System.out.println(fraction + " " + fraction2);
//        fraction.mult2(fraction2);
//        System.out.println(fraction);
//        fraction.div2(fraction2);
//        System.out.println(fraction);
//        System.out.println(fraction.value());
//        System.out.println(fraction.equals(fraction2));
        System.out.println(fraction.numberPart());

    }
}
