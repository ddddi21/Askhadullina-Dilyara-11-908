package TRRR;

public class Static {
    public static double plll(Rb_tr[] rb_trs) {
        double pp = 0;
        for (Rb_tr tr : rb_trs) {
            pp += tr.pl();
        }
        System.out.print("the sum of areas is:");
        return pp;
    }

    public static boolean haveSameTriangles(Rb_tr[] rb_trs) {
        int k = 0;
        for (int i = 0; i <rb_trs.length; i++) {
            for (int j = i + 1; j < rb_trs.length; j++) {
                if (rb_trs[i].equals(rb_trs[j]) == true) {
                    k++;
                }
            }
        }
        if (k>0) {
            System.out.println("we have the same triangles!");
            return true;
        }
        else System.out.println("we haven't same triangles :(");
            return false;
    }
}
