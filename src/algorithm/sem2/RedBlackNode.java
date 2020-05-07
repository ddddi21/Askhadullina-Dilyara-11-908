package algorithm.sem2;

    class RedBlackNode<T extends Comparable<T>> {

        /** Possible color for this node */
        public static final int BLACK = 0;
        /** Possible color for this node */
        public static final int RED = 1;
        public T key;

        RedBlackNode<T> parent;

        RedBlackNode<T> left;

        RedBlackNode<T> right;
        public int numLeft = 0;
        public int numRight = 0;
        public int color;

        RedBlackNode(){
            color = BLACK;
            numLeft = 0;
            numRight = 0;
            parent = null;
            left = null;
            right = null;
        }

        // Constructor which sets key to the argument.
        RedBlackNode(T key){
            this();
            this.key = key;
        }

    }
