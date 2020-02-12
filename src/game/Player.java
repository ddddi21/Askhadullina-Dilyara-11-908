package game;

import java.util.Scanner;

public class Player {
    protected int hp;
    protected String name;
    Scanner sc = new Scanner(System.in);
    static int max_power_of_kick = 10;


    public Player () {
        hp = 100;
        this.name = sc.nextLine();
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName () {
        return name;
    }

    public String setName() {
       return name = sc.nextLine();
    }

    public String toString() {
        return name;
    }

    public void kick (Player p) {
            System.out.println("enter your power of kick!");
            int power_of_kick = sc.nextInt();
            int ver = (int) (Math.random()*10);
            if (ver<(max_power_of_kick - power_of_kick)) {
                p.setHp(p.getHp() - power_of_kick);
                System.out.println(p.getHp() + " " + "hp left");
            } else {
                System.out.println("you didn't hit! ha ha! try next time :)");
            }
    }
}
