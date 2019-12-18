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

    public ComplexNumber add(ComplexNumber number) {
        ComplexNumber complexNumber = new ComplexNumber((this.re + number.re), this.im + number.im);
        return complexNumber;
    }

    public void add2(ComplexNumber number) {
        setIm(add(number).im);
        setRe(add(number).re);

    }

    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(3,2);
        ComplexNumber complexNumber2 = new ComplexNumber(1.3,8);

    }
}
