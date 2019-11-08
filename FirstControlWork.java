import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Асхадуллина Диляра
 * 11-908
 * Высшая школа информационных технологий и систем
 * Казанский (Приволжский) федеральный университет
 *
 *  Контрольная работа №1.
 */

public class FirstControlWork {
    /**
     * Метод выводит содержимое массива в строку.
     */
    public static String arrayToString(int[] numbers) {
        String result = "";
        for (int i = 0; i < numbers.length; i++) {
            result += (i == 0 ? "[" : "") + numbers[i] + (i < numbers.length - 1 ? "," : "]");
        }
        return result;
    }

    /**
     * 1.
     * Создать массив до заданного числа такой, что каждый элемент больше предыдущего на 7.
     * Первое значение случайное от 0 до 100.
     */
    public static int[] getSevensArray(int limit) {
        int fr = (int) (Math.random()*100);
        int c_lim = Math.round((int) ((limit - fr) / 7));
        int[] array = new int[c_lim];
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 7;
        }
        return array;
    }

    /**
     * 2.
     * Дан массив. Найти второй самый большой элемент.
     */
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
            if (array[i] > array[max2]) {
                max2 = i;
            }

        }
        return array[max2];
    }

    /**
     * 3.
     * Написать метод сравнивающий два числа с плавающей точкой с точностью до двух разрадов.
     * @return boolean
     */
    public static  boolean isDoubleEquals (double a, double b){
         if (String.format("%.2f",a ) == String.format("%.2f",b )) {
             return true;
        } else {
             return false;
        }
    }

    /**
     * 4.
     * Проверить является ли число простым.
     * Число является простым является простым,
     * если оно больше 1 и при этом делится без остатка только на 1 и на себя.
     * Единица не простое число.
     */
    public static boolean isPrime (int x) {
        boolean b = false;
        for (int i = 1; i < x ; i++) {
            if ((x > 1) && ((x%1) == 0) && (x/i ==0)) {
                b = false;
            } else {
                b = true;
            }
        }
        if (b == true){
            return true;
        } else
            return false;
    }

    /**
     * 5.
     * Даны две строки: слово и разделитель, вывести строку содержащую количество вхождений слова, разделенноый разделителем.
     * Например, ("Word", "X", 3) => WordXWordXWord.
     */
    public static String repeatSeparator (String word, String sep, int count) {
        String str = "";
        for (int i = 0; i <count ; i++) {
            str += word.concat(sep);
            if (i!=(count - 1)){
                str +=sep;
            }
        }
        return str;
    }

    /**
     * 6.
     * Сгенерировать текст классической английской песни "99 Bottles of Beer on the Wall":
     * "99 bottles of beer on the wall, 99 bottles of beer.
     * Take one down and pass it around, 98 bottles of beer on the wall.
     *
     * 98 bottles of beer on the wall, 98 bottles of beer.
     * Take one down and pass it around, 97 bottles of beer on the wall.
     *
     * ...
     *
     * 1 bottle of beer on the wall, 1 bottle of beer.
     * Take one down and pass it around, no more bottles of beer on the wall.
     *
     * No more bottles of beer on the wall, no more bottles of beer.
     * Go to the store and buy some more, 99 bottles of beer on the wall."
     *
     * Результат записать в файл.
     */
    public static void singSong () throws IOException {
        FileWriter file = new FileWriter("99 Bottles of Beer on the Wal.txt");
        int bottle = 99;
        while (bottle !=0) {
            file.write(bottle + " bottles of beer on the wall" + bottle + "bottles of beer. \n");
            bottle--;
            if (bottle == 0) {
                file.write("Take one down and pass it around, 97 bottles of beer on the wall. \n\n");
            } else {
                file.write("Take one down and pass it around, " + bottle + " bottles of beer on the wall.\n\n");
            }
        }
        file.write("No more bottles of beer on the wall, no more bottles of beer.\n");
        bottle = 99;
        file.write("Go to the store and buy some more, " + bottle + " bottles of beer on the wall.");
        file.close();
    }



//    //7??
//    public static String getBookName (String entry) {
//        Pattern sub = Pattern.compile("[0-9]*[-| ][0-9]*[-| ][0-9]*[-| ][0-9]*[-| ][0-9]*") ; // check ISBN
//        Matcher find = sub.matcher(entry);
//    }


    /**
     * 8.
     * ISBN состоит из 13 цифр. Последняя цифра контрольная. Вычисляется по алгоритму EAN-13 следующим образом:
     * 1. вычисляется сумма цифр на четных позициях;
     * 2. полученная сумма умножается на три;
     * 3. вычисляется сумма цифр на нечетных местах;
     * 4. полученные числа в п.2 и п.3 складываем;
     * 5. отбрасываем десятки и отнимаем из 10, и получаем контрольную цифру.
     * Если последняя цифра числа из п.4 = 0, то контрольная цифра равна нулю.
     * @return boolean
     */
    public static boolean isISBNValid (String str) {
        int sum =0;
        String bufStr = "";
        String num= "";
        num += str.charAt(str.length()-1);
        int lastNum = Integer.parseInt(num);
        num = "";
        int checkNum = 0;
        boolean check = false;
        for(int i = 0; i < str.length()-1; i++){
            if ((i+1) % 2 == 0){
                num+= str.charAt(i);
                sum = sum + Integer.parseInt(num) * 3;
                num = "";
            } else if ((i+1) % 2 != 0){
                num += str.charAt(i);
                sum += Integer.parseInt(num);
                num = "";
            }
        }
        bufStr = Integer.toString(sum);
        num+= (bufStr.charAt(bufStr.length()-1));
        checkNum= Integer.parseInt(num);
        num= "";

        if (checkNum == 0 & lastNum== 0){
            check = true;
        } else if(checkNum != 0 & (10 - checkNum) == lastNum ){
            check = true;
        }
        return check;


    }

    /**
     * 9.
     * Сделать частотный словарь букв заданной строки.
     * Например, "Abba" => "a: 2
     *                      b: 2",
     *           "java is awesome" => "a: 3
     *                                 e: 1
     *                                 i: 1
     *                                 j: 1
     *                                 m: 1
     *                                 o: 1
     *                                 s: 1
     *                                 v: 1
     *                                 w: 1".
     */
    public static String lettersFrequency (String str) {
        Map<Character, Integer> letters = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (letters.containsKey(str.charAt(i))) {
                letters.put(str.charAt(i), letters.get(str.charAt(i)));
            }
            else
            {
                letters.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> item : letters.entrySet())
        {
            System.out.print(item.getKey());
            System.out.print(": ");
            System.out.print(item.getValue());
            System.out.println();
        } 
    }

    public static void main(String[] args) throws IOException {
        int [] sevens;
        System.out.println("Массив \"семёрок\": " + (sevens = getSevensArray(200)));
        System.out.printf("Вторым самым большим элементом является %d.%n", getSecondLargest(sevens));

        /* TODO:
            Проверить является ли каждый элемент массива sevens простым.
            Если является, записать в массив, затем вывести эти числа и их количество.
            Для вывода используйте готовый метод arrayToString.
         */
        int [] primes = new int[0];
        for (int value : sevens) {

        }
//        int [] b = new int[30];
//        int i = 0;
//        for (int value : sevens) {
//            if (isPrime(value)== true) {
//                b[i] = value;
//                i++;
//            }
//            i = 0;
//            int count = 0;
//            while (b[i]!= 0 ) {
//                count++;
//            }
//        }
//        int [] primes = new int [count];
//        while (b[i])
        if (primes.length > 0) System.out.printf("Простые числа: %s : %d.%n", arrayToString(primes), primes.length);
        else System.out.println("В массиве нет простых чисел.");

        double a = Math.random() * 100;
        double b = Math.random() * 100;
        System.out.printf(isDoubleEquals(a, b) ? "Числа %f и %f равны, с точностью до эпсилон = 0,01.%n" : "Числа %f и %f не равны.%n", a, b);

        System.out.println("('Word', 'X', 3) => " + repeatSeparator("Word", "X", 3));

        singSong();
        /* TODO:
            Прочитайте из файла, полученного в предыдущем задании, текст и вычислите для него частотный словарь букв.
         */
        String song = "";
        System.out.printf("Частотный словарь букв: %n%s", lettersFrequency(song));

        /* TODO:
            Прочитайте файл 'references.txt', в нем содержится список литературы, на каждоый строке новая запись.
            В третьей строке ISBN с ошибкой.
         */
        String filename = "references.txt";
        String entry = "";
       // System.out.printf("Список литературы:%n%s%n", getBookName(entry));
    }

}
