package exercises_abr;

public class Matrix2x2 {
    double[][] mas = new double[2][2];

    public Matrix2x2() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mas[i][j] = 0;
            }
        }
    }

    public Matrix2x2(double k) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mas[i][j] = k;
            }
        }
    }

    public Matrix2x2(double[][] mas2) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mas[i][j] = mas2[i][j];
            }
        }
    }


    public Matrix2x2(double a, double b, double c, double d) {
        mas[0][0] = a;
        mas[0][1] = b;
        mas[1][0] = c;
        mas[1][1] = d;
    }

    @Override
    public String toString() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(mas[i][j]);
            }
        }
        return " ";
    }

    public Matrix2x2 add(Matrix2x2 matrix) {
        Matrix2x2 matrix_add = new Matrix2x2();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix_add.mas[i][j] = this.mas[i][j] + matrix.mas[i][j];
            }
        }
        return matrix_add;
    }

    public void add2(Matrix2x2 matrix) {
        this.mas = this.add(matrix).mas;
    }

    public Matrix2x2 sub(Matrix2x2 matrix) {
        Matrix2x2 matrix_sub = new Matrix2x2();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix_sub.mas[i][j] = this.mas[i][j] - matrix.mas[i][j];
            }
        }
        return matrix_sub;
    }

    public void sub2(Matrix2x2 matrix) {
        this.mas = this.sub(matrix).mas;
    }

    public Matrix2x2 multNumber(double k) {
        Matrix2x2 matrix_multNumber = new Matrix2x2();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix_multNumber.mas[i][j] = this.mas[i][j] * k;
            }
        }
        return matrix_multNumber;
    }

    public void multNumber2(double k) {
        this.mas = this.multNumber(k).mas;
    }

    public Matrix2x2 mult(Matrix2x2 matrix) {
        Matrix2x2 matrix_mult = new Matrix2x2();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix_mult.mas[i][j] = this.mas[i][j] * matrix.mas[i][j];
            }
        }
        return matrix_mult;
    }

    public void mult2(Matrix2x2 matrix) {
        this.mas = this.mult(matrix).mas;
    }

    //?
    public double det() {
        double d = (mas[0][0] * mas[1][1]) - (mas[0][1] * mas[1][0]);
        return d;
    }

    public void transport() {
        double m = this.mas[0][1];
        this.mas[0][1] = this.mas[1][0];
        this.mas[1][0] = m;
    }

    public Matrix2x2 inverseMatrix() {
        Matrix2x2 matrix2x2 = new Matrix2x2();
        double m =(this.det());
        double p = this.mas[0][0];
        this.mas[0][0] = this.mas[1][1];
        this.mas[1][1] =  p;
        this.mas[0][1] =  - this.mas[0][1];
        this.mas[1][0] =  -this.mas[1][0];
        Matrix2x2 mm = new Matrix2x2(this.mas[0][0], this.mas[0][1], this.mas[1][0], this.mas[1][1]);
        if (m == 0)
            return (matrix2x2);
        else {
            mm.multNumber2(1/m);
            return mm;
        }
    }

    public Vector2D multVector(Vector2D vector2D) {
       this.mas[0][0] *= vector2D.x;
       this.mas[1][0] *= vector2D.y;
       Vector2D vector = new Vector2D(this.mas[0][0], this.mas[1][0]);
       return vector;
    }



    public static void main(String[] args) {
        Matrix2x2 matrix2x2 = new Matrix2x2(2);
        Matrix2x2 matrix2x2__2 = new Matrix2x2(3);
        Matrix2x2 matrix2x2__3 = new Matrix2x2(1, 2, 3, 4);
        Vector2D vector2D = new Vector2D(3,5);
//        System.out.println(matrix2x2.add(matrix2x2__2));
//        matrix2x2.add2(matrix2x2__2);
//        System.out.println(matrix2x2);
//        matrix2x2.sub2(matrix2x2__2);
//        System.out.println(matrix2x2);
//        matrix2x2.multNumber2(4);
//        System.out.println(matrix2x2);
//        matrix2x2.mult2(matrix2x2__2);
//        System.out.println(matrix2x2);
//        System.out.println(matrix2x2__3.det());
//        System.out.println(matrix2x2);
//        matrix2x2__3.transport();
//        System.out.println(matrix2x2__3);
//        matrix2x2__3.inverseMatrix();
//        System.out.println(matrix2x2__3);
        matrix2x2__3.multVector(vector2D);
        System.out.println(matrix2x2__3);
    }

}
