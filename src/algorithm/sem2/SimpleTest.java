package algorithm.sem2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//На вход подаются уникальные номера клеток животных в зоопарке. Числа целые (номер от 0 до 10000 включительно). Если клетка помечена номером 10 - значит животное выпустили на свободу,
//и клетку нужно освободить. Если клетка помечена номером 0 - животное погибло, и клетку тоже нужно очистить. Если 20 - животное выкупили (освободить клетку).
// Если такое произошло, и есть животные, которые были выпущены, куплены и погибшие, - сообщите. Если таких вовсе нет - сообщите. А также найдите процент клеток, номер которых больше 100, и сравните с
//процентом клеток, номер которых меньше 20 (статистика необходима для ведения учета и еженедельных проверок зоопарка). Сообщите, сколько клеток теперь.
//Также клетки окрашены в цвета - красный и черный (на другие цвета у зоопарка нет средств, к сожалению). У хозяина есть любимое число  - 21. И любимый цвет - красный.
// Если найдете такую клетку, обрадуйте хозяина зоопарка - сообщите ему! Он будет очень рад. А также скажите, сколько клеток имеют номер больше, чем
//его любимое число (если есть такая клетка), ему правда очень важно знать.
public class SimpleTest {
    public static void main(String[] args) throws IOException {
        RedBlackTree<Integer> redBlackTree = new RedBlackTree<>();
        FileReader fileReader = new FileReader("./src/algorithm/sem2/data.txt");
        BufferedReader buffer = new BufferedReader(fileReader);
        String number = " ";
        while ((number = buffer.readLine()) != null) {
            redBlackTree.insert(Integer.parseInt(number));
        }
        buffer.close();
        zoo(redBlackTree);

    }
    private static void zoo(RedBlackTree redBlackTree) {
        System.out.print("before size was: " + redBlackTree.size() + "    ");


        boolean free =false;
        if (redBlackTree.searchboolean(10)) {
            RedBlackNode node2 = redBlackTree.search(10);
            redBlackTree.remove(node2);
            System.out.print("the animal is free now!" + "    ");
            free = true;
        }

        boolean dead = false;
        if (redBlackTree.searchboolean(0)) {
            RedBlackNode node2 = redBlackTree.search(0);
            redBlackTree.remove(node2);
            System.out.print("the animal is dead, I'm sorry :(" + "    ");
            dead = true;
        }

        boolean newhome =false;
        if (redBlackTree.searchboolean(20)) {
            RedBlackNode node2 = redBlackTree.search(20);
            redBlackTree.remove(node2);
            System.out.print("the animal has new home!" + "    ");
            newhome = true;
        }

        if(!free && !dead && !newhome) System.out.print("no one isn't gone"+ "    ");

        boolean favorite = false;
        if(redBlackTree.searchboolean(21)) {
            RedBlackNode node = redBlackTree.search(21);
            if (node.color == 1) ;
            System.out.print("Owner, we found your favorite!" + "    ");
            int k = redBlackTree.findNumGreater(node, 21);
            System.out.print("number of elements greater than favorite: " + k + "    ");
        } else {
            System.out.print("Owner, I'm sorry, but we didn't found your favorite =(" + "    ");
        }


        int size = redBlackTree.size();
        double p = ((((double) redBlackTree.numGreater(100)/size) *100) - (((double)redBlackTree.numSmaller(20)/size) * 100));
        System.out.print("percentage difference between number of cages which number greater than 100 and cages which number smaller than 20 " + Math.abs(p) + "    ");
        System.out.print("size became: "+ redBlackTree.size());
        System.out.println();


    }
}
