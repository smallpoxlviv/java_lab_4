package ua.lviv.iot.dwelling.model;

public class Flat extends AbstractDwellingInHouse {

    private int neighboringApartmentsOnFloorCount;

    public Flat(double areaInSquareMeters, double priceInUSD, Location location, String district, int balconyCount) {
        super(areaInSquareMeters, priceInUSD, location, district, balconyCount);
    }

    public int getNeighboringApartmentsOnFloorCount() {
        return neighboringApartmentsOnFloorCount;
    }

    public void setNeighboringApartmentsOnFloorCount(int neighboringApartmentsOnFloorCount) {
        this.neighboringApartmentsOnFloorCount = neighboringApartmentsOnFloorCount;
    }
}
