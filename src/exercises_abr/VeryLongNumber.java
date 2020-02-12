package exercises_abr;

public class VeryLongNumber implements Number {
    String number = " ";

    public VeryLongNumber(String number) {
        this.number = number;
    }

    public long getNumber() {
        return Long.parseLong(number);
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "VeryLongNumber{" +
                "number='" + number + '\'' +
                '}';
    }

    public VeryLongNumber() {
        super();
    }

    @Override
    public Number add(Number n) {
        String sum = "";
        String sumSecond = "";
        if (("" + this.getNumber()).length() >= ("" + n.getNumber()).length()){
            sum += this.getNumber();
            sumSecond += n.getNumber();
        } else {
            sum += n.getNumber();
            sumSecond += this.getNumber();
        }
        String answer = "";
        int buffer = 0;
        for (int i = 0; i < sum.length(); i++) {
            int a = Integer.parseInt("" + sum.charAt(sum.length() - 1-i));
            a += buffer;
            int b = 0;
                b = Integer.parseInt("" + sumSecond.charAt(sumSecond.length() - 1-i));
                int c = (a + b) % 10;
                buffer = (a + b) / 10;
                answer = c + answer;
        }
        if (buffer != 0) {
            answer = buffer + answer;
        }
        this.setNumber(answer);
        return this;
    }

    @Override
    public Number sub(Number n) {
        return null;
    }

    @Override
    public int compareTo(Number n) {
        return 0;
    }
}
