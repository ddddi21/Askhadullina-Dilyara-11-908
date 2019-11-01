import java.util.Scanner;

public class String_HW {

    public static int string41( String s) {
        String [] pr;   // зачем массив?
        pr = s.split("\\s+");
          return pr.length;
    }
    public static void string42 (String s) {
        String [] pr;
        int k = -1;
        pr = s.split("\\s+");
        for(String str : s.split("\\s+")){
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                k++;
            }
        }
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
        for ( String str :s.split("а|А|О|о|Е|е|И|и|Я|я|Ы|ы|У|у|Ю|ю|Э|э|Ё|Ё/gmx")) { // попробуйте в середину текста добавить "Ё/gmx".
            k++;
        }
        return k;
    }

    public static void string57 (String s) {
        for (String sl : s.split("\\s+")) {
            System.out.print(sl); // Строка не меняется(
            System.out.print(" ");
        }
        System.out.println();
    }

    /*public static void string58 (String s) {
        String newStr;
        for (String str : s.split("\\s+")) {
            for (String sl : s.split(".?=.txt)/g")) {
                // newStr = str.replaceAll(s,s.split(".?=.txt)/g"));
                newStr = sl;

                System.out.print(newStr);
                System.out.print(" ");
                //}
            }
            System.out.println();
        }
    }*/



    public static void main (String[] args) {
        System.out.println("Enter the line:");
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("количество слов:"+string41(s));
        System.out.println("количество глассных"+ string54(s));
        string57(s);
        string42(s);
        string52(s);
        //string58(s);
    }
}
