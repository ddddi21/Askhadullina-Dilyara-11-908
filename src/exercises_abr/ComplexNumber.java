package exercises_abr;

public class ComplexNumber {
    protected double re;
    protected double im;


    public ComplexNumber() {
        re = 0;
        im = 0;
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }

   @Override
    public String toString () {
        if (im<0) {
            return (re + " " + im + " * i");
        } else
            return (re + " + "+ im + " * i");
    }


    public ComplexNumber add(ComplexNumber number) {
        ComplexNumber complexNumber = new ComplexNumber((this.re + number.re), this.im + number.im);
        return complexNumber;
    }


    public void add2(ComplexNumber number) {
        setIm(add(number).im);
        setRe(add(number).re);
    }

    public ComplexNumber sub (ComplexNumber number ) {
        ComplexNumber complexNumber = new ComplexNumber((this.re - number.re), (this.im - number.im));
        return complexNumber;
    }

    public void sub2 (ComplexNumber number) {
        setIm(sub(number).im);
        setRe(sub(number).re);
    }

    public ComplexNumber multNumber(double mult) {
        ComplexNumber complexNumber = new ComplexNumber((this.re * mult), (this.im * mult));
        return complexNumber;
    }

    public void multNumber2 (double mult) {
        ComplexNumber complexNumber = this.multNumber(mult);
        setRe(complexNumber.re);
        setIm(complexNumber.im);
    }

    public ComplexNumber mult (ComplexNumber number) {
        ComplexNumber complexNumber = new ComplexNumber((this.re * number.re - this.im * number.im), (this.im * number.re + this.re * number.im));
        return complexNumber;
    }

    public void mult2(ComplexNumber number) {
        ComplexNumber complexNumber = this.mult(number);
        setIm(complexNumber.im);
        setRe(complexNumber.re);
    }

    public ComplexNumber div (ComplexNumber number) {
        double new_re = (this.re * number.re + this.im * number.im);
        double new_znam = number.re * number.re + number.im * number.im;
        double new_im = (this.im * number.re - this.re * number.im);
        ComplexNumber complexNumber = new ComplexNumber(new_re/new_znam, new_im/new_znam);
        return complexNumber;
    }

    public void div2 (ComplexNumber number) {
        ComplexNumber complexNumber = this.div(number);
        setRe(complexNumber.re);
        setIm(complexNumber.im);
    }

    public double length() {
        return (Math.sqrt(this.re * this.re + this.im * this.im));
    }

    public double arg() {
        double q = Math.atan(this.im/this.re);
        return q;
    }

    public ComplexNumber pow (double k ) {
        ComplexNumber z =  new ComplexNumber((Math.pow(this.length(), k) * (Math.cos(k * this.arg()))),(Math.pow(this.length(), k) *  Math.sin(k * this.arg())));
        return z;
    }

    public boolean equals (ComplexNumber number) {
        if ((this.re == number.re ) & (this.im == number.im))
            return true;
        else return false;
    }


    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(3,2);
        ComplexNumber complexNumber2 = new ComplexNumber(1,8);
//        complexNumber.add2(complexNumber2);
//        System.out.println(complexNumber);
//        complexNumber.sub2(complexNumber2);
//        System.out.println(complexNumber);
//        complexNumber2.multNumber2(2);
//        System.out.println(complexNumber2);
//        System.out.println(complexNumber.mult(complexNumber2));
//        complexNumber.mult2(complexNumber2);
//        System.out.println(complexNumber);
//        complexNumber.div2(complexNumber2);
//        System.out.println(complexNumber);
//        System.out.println(complexNumber2.length());
//        System.out.println(complexNumber.arg());
//        System.out.println(complexNumber.pow(4));
        System.out.println(complexNumber.equals(complexNumber));
    }
}
