import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_HW {

    public static int string41( String s) {
        String [] pr;
        pr = s.split("\\s+");
          return pr.length;
    }
    public static void string42 (String s) {
        String [] pr;
        int k = 0;
        pr = s.split("\\s+");
        for(String str : s.split("\\s+")){
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                k++;
            }
        }
        if (k==0)
            System.out.println("нет таких слов"); else
        System.out.println("количество слов, которые начинаются и заканчиваются одной и той же буквой:"+k);

    }

    public static void string52 (String s) {
        String newStr;
        for (String str : s.split("\\s+")) {
            newStr = Character.toUpperCase(str.charAt(0)) + str.substring(1);
            System.out.print(newStr);
             System.out.print(" ");
        }
        System.out.println();
    }

    public static int string54 (String s) {
        int k = 0;
        for ( String str :s.split("а|А|О|о|Е|е|И|и|Я|я|Ы|ы|У|у|Ю|ю|Э|э|Ё|ё/gmx")) {
            k++;
        }
        return k;
    }

    public static void string57 (String s) {
        for (String sl : s.split("\\s+")) {
            System.out.print(sl);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void string58 (String s) {
        Pattern sub = Pattern.compile("(?=\\w+\\.).+") ;
        Matcher find = sub.matcher(s);
        while (find.find()) {
            System.out.println(s.substring(find.start(), s.indexOf('.')));

            System.out.println();
        }
    }

    public static void string59 (String s){
        Pattern sub = Pattern.compile("(?<=\\.)(.+)$") ;
        Matcher find = sub.matcher(s);
        while (find.find()) {
            System.out.println(s.substring(find.start()));
        }
        System.out.println();

    }

    public static void string69 (String s) {
        Pattern otk = Pattern.compile("\\(");
        Pattern zak = Pattern.compile("\\)");
        Matcher find_otk = otk.matcher(s);
        Matcher find_zak = zak.matcher(s);
        int num_otk = 0;
        int num_zak = 0;
        int i_zak;
        int i_otk;
        i_zak = s.indexOf(")");
        i_otk = s.indexOf("(");
        while (find_otk.find()) {
            num_otk++;
        }
        while (find_zak.find()) {
            num_zak++;
        }
        if(i_otk>i_zak) {
            System.out.println(i_zak);
        } else {
            if (num_otk == num_zak) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }
    }



    public static void main (String[] args) {
        System.out.println("Enter the line:");
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("количество слов:"+string41(s));
        System.out.println("количество глассных"+ string54(s));
        string57(s);
        string42(s);
        string52(s);
        string58(s);
        string59(s);
        string69(s);
    }
}
