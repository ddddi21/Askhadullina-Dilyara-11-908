package algorithm.semestrovka;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"ad", "da", "fwf", "ew","yay","aabaa","bababab","bebab","tnn"};
        String [] arr2 = {"o", "oo"};
        WordSet w1 = new WordSet(arr);
        WordSet w2 = new WordSet(arr2);
        WordSet w3 = new WordSet(w1,w2);

        System.out.println(w3);

        //тест метода insert
        System.out.println("тест метода insert:");
        String word = "da";
        String word2 = "qqq";
        w3.insert(word);
        w3.insert(word2);
        System.out.println(w3);

        System.out.println();

        // тест метода delete
        System.out.println("тест метода delete:");
        w3.delete("ooo");
        w3.delete("qqq");
        w3.delete("bebab");
        System.out.println(w3);

        System.out.println();

        // тест метода newWordSetByWordLength
        System.out.println("тест метода newWordSetByWordLength:");
        WordSet w4= w3.newWordSetByWordLength(3);
        System.out.println(w4);
        WordSet w5 = w3.newWordSetByWordLength(2);
        System.out.println(w5);

        System.out.println();

        //тест метода vowelDivide
        System.out.println("тест метода vowelDivide:");
        WordSet[] wordSets = w3.vowelDivide();
        System.out.println(Arrays.toString(wordSets));

        System.out.println();

        //тест метода removePalindrome
        System.out.println("тест метода removePalindrome:");
        w3.removePalindrome();
        System.out.println(w3);

    }
}
