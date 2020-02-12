package java_task_hw;

public class Rec {
    static int Sum(int i, int[] A) {
        if (i==(A.length-1))
            return A[i];
        return A[i] + Sum(i+1,A);
    }

    public static void main(String[] args) {
        int[] m = {1,2,5,8,0};
        System.out.println(Sum(0,m));
    }
}
