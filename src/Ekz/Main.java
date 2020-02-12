package TRRR;

import TRRR.Static;
public class Main {
    public static void main(String[] args) {
        Rb_tr tr1 = new Rb_tr(7, 3, 7);
        Rb_tr tr2 = new Rb_tr(3, 2, 3);
        Rb_tr tr3 = new Rb_tr(2,1,2);
        Rb_tr tr4 = new Rb_tr(3,2,3);
        Rb_tr [] rb_trs = {tr1, tr2, tr3};
//        System.out.println(tr1.per());
//        System.out.println(tr1.pl());
//        System.out.println(tr1.equals(tr2));
//        System.out.println(tr1.equals(tr3));
//        System.out.println(tr1);
        System.out.println(Static.plll(rb_trs));
        System.out.println(Static.haveSameTriangles(rb_trs));
    }
}
