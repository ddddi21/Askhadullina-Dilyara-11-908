package exercises_abr;

    public class SimpleLongNumber implements Number {
         long number;

         public SimpleLongNumber() {
             number = 0;
         }

        @Override
        public long getNumber() {
            return number;
        }

        public void setNumber(long number) {
            this.number = number;
        }

        @Override
        public String toString(){
             return " " + this.getNumber();
        }

        @Override
         public Number add(Number n) {
             this.setNumber(this.getNumber() + n.getNumber());
             return this;
         }

         @Override
         public Number sub(Number n) {
             long s = this.getNumber() - n.getNumber();
             this.setNumber(s);
             return this;
         }

         @Override
         public int compareTo(Number n) {
             if(this.getNumber() > n.getNumber()){
                 return 1;
             } else if ( this.getNumber() < n.getNumber()){
                 return -1;
             }
             return 0;
         }
     }

