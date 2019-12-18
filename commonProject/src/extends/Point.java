public class Point {
    // поля класса
    private int x;
    private int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        if (x >= 0 && y >= 0){
            this.x = x;
            this.y = y;
        }else{
            System.out.println("Ошибка!");
        }
    }

    public Point(double x, double y){

    }

    public Point move(int x, int y){
        return new Point (x, y);
    }

    public static void main(String[] args) {
//        int x, y;
        Point p = new Point();
        Point p2 = new Point(1, 2);
//        System.out.println();

    }

}
