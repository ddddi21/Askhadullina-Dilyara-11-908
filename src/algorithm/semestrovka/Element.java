package algorithm.semestrovka;

public class Element {
        String data;
        Element next;

        Element(String data, Element next) {
            this.data = data;
            this.next = next;
        }

        Element(String data) {
            this.data = data;
            this.next = null;
        }


        public Element(Element next) {
            this.next = next;
        }
        boolean hasNext() {
            return next != null;
        }
}

