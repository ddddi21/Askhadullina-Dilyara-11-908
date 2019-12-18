import java.util.Scanner;

public class ft {

    public static int getSecondLargest(int[] array) {
        int max1;
        int max2;
        if (array[0] > array[1]) {
            max1 = 0;
            max2 = 1;
        } else {
            max1 = 1;
            max2 = 0;
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] > array[max1]) {
                int b = max1;
                max1 = i;
                if (array[b] > array[max2]) {
                    max2 = b;
                }
            }
            // ошибка здесь
            if (array[i] > array[max2]) {
                max2 = i;
            }

        }
        return array[max2];

    }
    public static  boolean isDoubleEquals (double a, double b){
        if (String.format("%.2f",a ) == String.format("%.2f",b )) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int[] array = new int[m];
        for (int i = 0; i < m; i++) {

            array[i] = (int) (Math.random() * 7);
            System.out.printf("%4d", array[i]);
            System.out.println();
        }
        String str = "";
        String word = "World";
        String sep = "x";
        int count = 5;
        for (int i = 0; i <count ; i++) {
            str += word.concat(sep);
            if (i!=(count - 1)){
                str +=sep;
            }
        }
        System.out.println(str);
       // System.out.println(getSecondLargest(array));
        //System.out.println(isDoubleEquals(a,b));
    }

}