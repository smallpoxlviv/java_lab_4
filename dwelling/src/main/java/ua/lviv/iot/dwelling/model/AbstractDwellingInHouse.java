package ua.lviv.iot.dwelling.model;

public abstract class AbstractDwellingInHouse extends AbstractDwelling {

    public AbstractDwellingInHouse(double areaInSquareMeters, double priceInUSD, Location location, String district,
            int balconyCount) {
        super(areaInSquareMeters, priceInUSD, location, district, balconyCount);
    }

    private int numberOfFloor;

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
}
