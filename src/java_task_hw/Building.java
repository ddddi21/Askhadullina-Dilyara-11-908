public class Building {
    //polya classa
    protected String address;
    protected int floorsCount;
    protected double area;

    //contructor classa
     public Building (String address, int floorsCount, double area ) {
         this.address = address;
         this.area = area;
         this.floorsCount = floorsCount;
     }
     public void print () {
         System.out.println("Building address" + this.address);
         System.out.println(" area is" + this.area);
         System.out.println(" count of floors" + this.floorsCount);
     }

     public Building building(String address, int floorsCount, double area) {
         return new Building(address,floorsCount,area);
     }

    public String getAddress() {
        return address;
    }

    public double getArea() {
        return area;
    }

    public int getFloorsCount() {
        return floorsCount;
    }
    public static void main (String[] args) {
        Building univer = new Building("Kremlevskaya 35", 16,1000000);
        Building kremlin = new Building( "mdlcm", 1, 1221211);
        System.out.println(kremlin.address);
        System.out.println(kremlin.floorsCount);
        System.out.println(kremlin.area);
        ApartmentBuilding ap = new ApartmentBuilding("Tukaya7", 4, 2323,67);
        System.out.println(ap.getAddress());
    }


    public Building(){
         address = "Kremlevskaya 35";
         floorsCount = 16;
         area = 193913;
     }
}

