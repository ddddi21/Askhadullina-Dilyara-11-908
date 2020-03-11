package algorithm.semestrovka;

public class E_List {
    private Element head;

    public E_List(Element head) {
        this.head = head;
    }

    E_List() {
        head = null;
    }

    public void add(String data) {
        if (head == null) {
            head = new Element(data);
        } else {
            Element cur = head;
            while (cur.next != null){
                cur = cur.next;
            }
            cur.next = new Element(data);
        }
    }

    public String toString(){
        String answer = "[ ";
        Element cur = head;
        if (cur == null) {
            return ("нулевой список");
        } else {
            while (cur != null) {
                answer += cur.data + " ";
                cur = cur.next;
            }
            answer += "]";
        } return answer;
    }

    public void removeSame() {
        Element cur = head;
        while (cur != null) {
            while (cur.next != null && cur.data.equals(cur.next.data)) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
    }


    public int size(){
        Element cur = head;
        int i = 0;
        while (cur != null) {
            cur = cur.next;
            i++;
        } return i;
    }

    public Element get(int index) {
        Element cur = head;
        int i = 0;
            while (cur.hasNext() && i != index) {
                cur = cur.next;
                i++;
            }
        return cur;
    }

    public String getData(int index){
        return get(index).data;
    }

    public void setData(int index,String d) {
        get(index).data = d;
    }



    public void sort(E_List list){
        for (int i = 0; i <list.size(); i++) {
            for (int j = i; j <list.size() ; j++) {
                String s = list.getData(i);
                String s2 = list.getData(j);
                if (s2.compareTo(s) < 0) {
                    String s3 = list.getData(i);
                    list.setData(i,s2);
                    list.setData(j,s3);
                }
            }
        }
    }

    public Element getFirst(){
        return head;
    }

    public Element getLast() {
        Element cur = head;
        if (head != null) {
            while (cur.hasNext()) {
                cur = cur.next;
            }
            if (cur.hasNext() && cur.next.next == null) {
                return cur.next;
            }
        }return cur;
    }

    public void setHead(Element head) {
        this.head = head;
    }

    public void remove(int index) {
        Element cur = head;
        if (index > 1) {
            for (int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }
            if  (cur.next!=null) {
                cur.next = cur.next.next;
            } else cur = null;
        } else
        if (cur.next!= null && index == 1){
            cur.next = cur.next.next;
        } else
        if (index == 0) {
            head = cur.next;
        }
    }
}
