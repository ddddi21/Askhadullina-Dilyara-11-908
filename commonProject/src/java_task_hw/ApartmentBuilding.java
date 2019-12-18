

public class ApartmentBuilding extends Building {
    private int floatCount;
    public ApartmentBuilding(String address, int floorsCount, double area,int floatCount) {
        super(address, floorsCount, area);
        this.floatCount = floatCount;
    }
    public int getFloatCount() {
        return floatCount;
    }
    @Override
    public void print() {

    }
}

