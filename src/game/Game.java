package game;
//

public class Game {
    public static void main(String[] args) {
        System.out.println("choose your player!");
     Player first = new Player();
     System.out.println("choose your player!");
     Player second = new Player();
     while ((first.getHp()>0) && (second.getHp()>0)) {
             first.kick(second);
         if (second.getHp()>0) {
             second.kick(first);
         }
     }
         if ((first.getHp()<=0) || (second.getHp()<=0)) {
             System.out.println("game over");
             if (first.getHp()<=0) {
                 System.out.println("the player" + " " + second.toString() + " " + "win!");
             } else if (second.getHp()<=0) {
                 System.out.println("the player" + " " + first.toString() + " " + "win!");
             }
         }


     }


}


