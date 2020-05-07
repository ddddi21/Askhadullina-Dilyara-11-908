package algorithm.sem2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MainTest {
    public static void readData(RedBlackTree tree, int k) throws IOException {
        for (int i = 0; i < k ; i++) {
            System.out.println("files_" + i + ".txt");
            FileReader  fileReader = new FileReader("./src/algorithm/sem2/files/files_" + i + ".txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String s;
            double m = System.nanoTime();
            while((s = bufferedReader.readLine()) != null) {
                    tree.insert(Integer.parseInt(s));
            } bufferedReader.close();
            System.out.print("time for insert: ");
            System.out.println((double) ((System.nanoTime() - m)/ 1000000));
            m = System.nanoTime();
            tree.search(100);
            System.out.print("time for search: ");
            System.out.println((double) ((System.nanoTime() - m)/ 1000000));
            m = System.nanoTime();
            if (tree.searchboolean(5)) {
                tree.remove(tree.search(5));
                System.out.print("time for remove: ");
                System.out.println((double) ((System.nanoTime() - m)/ 1000000));
            }
            System.out.println("________________________________________");
        }
    }


    public static void main(String[] args) throws IOException {
        RedBlackTree<Integer> redBlackTree = new RedBlackTree<>();
        readData(redBlackTree, 71);
    }
}
