package algorithm.sem2;

import java.io.*;
import java.util.TreeSet;

public class Generate {
    public static void main(String[] args) throws IOException {
        TreeSet<Integer> set = new TreeSet<>(); //чтобы не было одинаковых элементов в дереве
        for (int i = 0; i < 71; i++) {
            File file = new File("C:/Users/Диляра/IdeaProjects/Askhadullina-Dilyara-11-908/src/algorithm/sem2/files/files_" + i + ".txt");
            FileWriter fileWriter = new FileWriter(file);
            for (int j = 0; j < 500; j++) {
                set.add((int) (Math.random() * 10001));
            }
            for (int j = 0; j < set.size(); j++) {
                int s = set.pollFirst();
                fileWriter.write(s + "");
                fileWriter.write("\n");
            }
            fileWriter.close();
        }
    }
}
