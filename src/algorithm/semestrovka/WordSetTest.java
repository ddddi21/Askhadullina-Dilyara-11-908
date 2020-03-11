package algorithm.semestrovka;

import org.junit.jupiter.api.Assertions;

class WordSetTest {

    @org.junit.jupiter.api.Test
    void testToString() {
            WordSet wordSet = new WordSet();
            wordSet.insert("fw");
            wordSet.insert("jfj");
            String expected = "[fw -> jfj]";
            String actual = wordSet.toString();
            Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void size() {
        WordSet wordSet = new WordSet();
        wordSet.insert("fw");
        wordSet.insert("jfj");
        int expected = 2;
        int actual = wordSet.size();
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void insert() {
        WordSet actual = new WordSet();
        actual.insert("a");
        actual.insert("b");
        String [] s = {"a","b"};
        WordSet expected = new WordSet(s);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void delete() {
        WordSet actual = new WordSet();
        actual.insert("a");
        actual.insert("b");
        actual.insert("c");
        actual.delete("a");
        String [] s = {"b","c"};
        WordSet expected = new WordSet(s);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void newWordSetByWordLength() {
        WordSet actual = new WordSet();
        actual.insert("a");
        actual.insert("bca");
        actual.insert("e");
        actual.insert("te");
        String [] s = {"a","e"};
        WordSet expected = new WordSet(s);
         WordSet actual_new = actual.newWordSetByWordLength(1);
        Assertions.assertEquals(expected, actual_new);
    }

    @org.junit.jupiter.api.Test
    void vowelDivide() {
        WordSet actual = new WordSet();
        actual.insert("A");
        actual.insert("bca");
        actual.insert("eth");
        actual.insert("te");
        WordSet gl = new WordSet();
        gl.insert("A");
        gl.insert("eth");
        WordSet sogl = new WordSet();
        sogl.insert("bca");
        sogl.insert("te");
        WordSet [] expected = {gl,sogl};
        WordSet[] actual_new = actual.vowelDivide();
        Assertions.assertArrayEquals(expected, actual_new);
    }

    @org.junit.jupiter.api.Test
    void removePalindrome() {
        WordSet actual = new WordSet();
        actual.insert("atu");
        actual.insert("bca");
        actual.insert("ete");
        actual.insert("abcdcba");
        String [] s = {"atu","bca"};
        WordSet expected = new WordSet(s);
        actual.removePalindrome();
        Assertions.assertEquals(expected, actual);

    }
}