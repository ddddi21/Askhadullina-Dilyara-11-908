import javax.print.DocFlavor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControlWorkReWriting {
    /**
     * Студент Асхадуллина Диляра
     * Группа 11-908
     * Высшая школа информационных технологий и систем
     * Казанский (Приволжский) федеральный университет
     *
     * Контрольная работа №3.
     *
     * Максимальный балл 10.
     * Итого:
     */

    /**
     * 1. Проверить является ли строка палиндромом.
     * Проверка:
     * метод:
     * тест:
     * Итого (макс. 2 балла):
     */
    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; ++i) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }


    /**
     * 2. Дана строка, сложить все числа в ней. Если чисел нет выводим 0. Протестировать.
     * <p>
     * Проверка:
     * метод:
     * тест:
     * Итого (макс. 2 балла):
     */
    public static Number fromTextSum(String s) {
        Pattern p = Pattern.compile("(\\d+)");
        Matcher m = p.matcher(s);
        Integer sum = 0;
        while (m.find()) {
            sum += Integer.parseInt(m.group(1));
        }
        if (sum > 0) {
            return sum;
        } else
            return 0;
    }


    /**
     * 3. Написать метод генерирующий сложный пароль (цифры, символы и латинский алфавит).
     * <p>
     * Проверка:
     * метод:
     * тест:
     * Итого (макс. 2 балла):
     */
    public static String generatePassword() {
        String password = "";
        int START_CHAR = (int) 'a';
        int passSize = (int) (Math.random() * 5) + 8;
        for (int i = 0; i < passSize; i++) {
            int choose = (int) (Math.random() * 3);
            if (choose == 0) {
                password += (char) ((int) (Math.random() * 22) + START_CHAR);
            } else if (choose == 1) {
                password += (char) ((int) (Math.random() * 5) + 33);
            } else {
                password += (char) ((int) (Math.random() * 9) + 48);
            }
        }
        return password;
    }

    /**
     * 4. Написать метод, который сравнивает две строки и выводит 0 если они равны, 1 если лексиграфически
     * первая находится раньше второй, -1 в обратном случае.
     * Проверка:
     * метод:
     * тест:
     * Итого (макс. 2 балла):
     */
     public static int compareStrings(String str1, String str2) {
//        char[] s = str1.toCharArray();
//        char[] s2 = str2.toCharArray();
//        int i = 0;
//        int mas = Math.min(s.length, s2.length);
//        for (i = 0; i < mas && s[i] == s2[i]; i++) {
//        }
//        if (mas == i) {
//            if (s.length < s2.length)
//                return 1;
//            if (s2.length < s.length)
//                return -1;
//            return 0;
//        }
//        else {
//            for (int j = 0; j < mas ; j++) {
//                if (s[j] < s2[j]) {
//                    return 1;
//                } else if(s[j] < s2[j]) {
//                    return -1;
//                }
//            }
//        }
//        return 0;
         int compare = 0;
         int size = 0;
         if (str1.length()-1 >= str2.length()-1){
             size = str2.length()-1;
         } else size = str1.length()-1;
         for (int i = 0; i <= size; i++) {
             int symbolFirst = (int)str1.charAt(i);
             int symbolSecond = (int)str2.charAt(i);
             if (symbolFirst < symbolSecond) return 1;
             else if(symbolFirst > symbolSecond) return -1;
         }
         if (str1.length() < str2.length() && str1.length() != str2.length()) {
             return 1;
         } else if (str1.length() > str2.length() && str1.length() != str2.length()){
             return -1;
         }

         return 0;
    }


    //abc abdc

    /**
     * 5. Описать рекурсивную функцию NOD(A, B) целого типа, находящую
     * наибольший общий делитель (НОД) двух целых положительных чисел A
     * и B, используя алгоритм Евклида:
     * НОД(A, B) = НОД(B, A mod B), если B != 0; НОД(A, 0) = A.
     * С помощью этой функции найти НОД(A, B), НОД(A, C), НОД(A,D), если
     * даны числа A, B, C, D.
     * <p>
     * Проверка:
     * метод:
     * тест:
     * Итого (макс. 2 балла):
     */


//        int max = a;
//        if (a > b) {
//            max = a;
//        } else if (b > a) {
//            max = b;
//        }
//        int nod = a * b;
//        int min_nod = a * b;
//        for (int i = max; i < nod; i++) {
//            if ((i % a == 0) && (i % b == 0)) {
//                nod = i;
//                if (nod <= min_nod) {
//                    min_nod = nod;
//                }
//                nod = a * b;
//            }
//        }
//        return min_nod;
//    }
        static void getGCD (int a, int b, int c, int d) {
            System.out.println(gCD(a, b));
            System.out.println(gCD(a, c));
            System.out.println(gCD(a, d));
        }

        static int gCD (int a, int b) {
            if (b == 0){
                return a;
            }
            else {
                return gCD(b, a % b);
            }
        }

    public static void main(String[] args) {
        String s = "kiik";
        String s2 = "cat";
        String s3 = "1 2 3 fg";
        int a = 3;
        int b = 9;
        int c = 0;
        int d = 4;
        String s4 = "abc";
        String s5 = "abdc";
        String s6 = "abc";
        String s7 = "abcd";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s2));
        System.out.println(fromTextSum(s3));
        getGCD(a,b,c,d);
        System.out.println(generatePassword());
        System.out.println(compareStrings(s5,s4));
        System.out.println(compareStrings(s4,s6));
        System.out.println(compareStrings(s4,s5));
    }


}
