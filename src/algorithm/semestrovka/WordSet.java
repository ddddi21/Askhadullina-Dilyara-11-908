package algorithm.semestrovka;


public class WordSet {
    E_List list = new E_List();


    //создание списка по массиву строк arr. Массив arr может быть неотсортирован.
    public WordSet(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        list.removeSame();
        list.sort();
    }

    public WordSet() {
    }

    //формирование одного списка из двух существующих w1, w2 (метод слияния)
    public WordSet(WordSet w1, WordSet w2) {
        int allsize = w1.size() + w2.size();
        for (int i = 0; i < allsize; i++) {
            list.add(w1.list.getData(i));
            for (int j = w1.size(); j < allsize; j++) {
                list.add(w2.list.getData(i));
            }
        }
        list.sort();
        list.removeSame();
    }

    //построение строки, представляющей из себя список, разделитель между словами – стрелочка (‘->’).
    public String toString () {
        Element cur = list.getFirst();
        String answer = "[";
        if (cur == null) {
            return ("нулевой список");
        } else {
            while (cur.next != null) {
                answer += cur.data + " " + "->" + " ";
                cur = cur.next;
            }
            answer += cur.data + "]";
        } return answer;
    }

    public int size() {
       return list.size();
    }

    @Override
    public boolean equals(Object obj) {
        String s1 = this.toString();
        String s2 = obj.toString();
        return s1.equals(s2);
    }

    //вставка слова в список без нарушения его упорядоченности. Если такое слово в списке присутствует, то ничего не происходит;
    public void insert (String word){
        Element cur = new Element(word);
        boolean k = false;
        if (list.getFirst() != null) {
            for (int i = 0; i < list.size(); i++) {
                if (word.equals(list.getData(i))) {
                    System.out.println("слово уже есть в списке");
                    k = true;
                    break;
                }
            }
            if (!k) {
                list.getLast().next = cur;
                cur.next = null;
                list.sort();
            }
        } else list.setHead(new Element(word, null));
    }


    //удаление слова из списка. Если такого слова нет - ничего не происходит;
    public void delete (String word) {
        boolean k = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.getData(i).equals(word)) {
                list.remove(i);
                k = true;
            }
        }
        if (!k){
            System.out.println("нет такого слова в списке");
        }
    }


    //формирования нового списка слов, имеющих фиксированную длину l. Исходный список при этом не уничтожается.
    public WordSet newWordSetByWordLength(int l) {
        WordSet newWordset = new WordSet();
        for (int i = 0; i < list.size(); i++) {
            if (list.getData(i).length() == l){
                newWordset.insert(list.getData(i));
            }
        } return newWordset;
    }


    //разбиение списка слов на два, соответственно содержащих слова, начинающиеся с гласных и согласных букв.
    //Метод возвращает массив из двух WordSet. Исходный список при этом не уничтожается.
     public WordSet [] vowelDivide() {
        WordSet [] wordSets = new WordSet[2];
         wordSets[0] = new WordSet();
         wordSets[1] = new WordSet();
         for (int i = 0; i < list.size() ; i++) {
             boolean check_english_gl = list.getData(i).matches("^(?i:[aeiouy]).*");
             if (check_english_gl) {
                 wordSets[0].insert(list.getData(i));
             } else {
                 wordSets[1].insert(list.getData(i));
             }
         }
         return wordSets;
     }


     //удаления из списка слов, которые одинаково читаются как слева направо, так и справа налево.
    public void removePalindrome() {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.getData(i).length() / 2; j++) {
                    if (list.getData(i).charAt(j) == list.getData(i).charAt(list.getData(i).length() - j - 1)) {
                        delete(list.getData(i));
                }
            }
        }
    }

}
