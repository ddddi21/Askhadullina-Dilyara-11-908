package game;

public class tea_moor_cycle {
    public static void main(String[] args) {
        Player tea_moor = new Player();
        for (int i = 0; i < 100; i++) {
            tea_moor.kick(tea_moor);
            }
        }
    }
