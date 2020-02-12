package extends_s.transports;


import java.util.Scanner;

public class All_transports {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int y = sc.nextInt();
        Car bmw = new Car();
        bmw.setColor();
        bmw.Move(x,y);
        bmw.Print();
        Bus bus = new Bus();
        bus.Move(x,y);
        bus.Print();
        TrolleyBus TrolleyBus = new TrolleyBus();
        TrolleyBus.Print();
    }
}
