package web.model;

public class Car {

    private String brand;

    private String model;

    private int yearOfManufacturing;

    public Car() {

    }

    public Car(String brand, String model, int yearOfManufacturing) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacturing = yearOfManufacturing;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacturing() {
        return yearOfManufacturing;
    }

    public void setYearOfManufacturing(int yearOfManufacturing) {
        this.yearOfManufacturing = yearOfManufacturing;
    }

    @Override
    public String toString() {
        return "Car's brand = " + this.brand
                + "\nCar's model = " + this.model
                + "\nCar's year of manufacturing = " + this.yearOfManufacturing;
    }
}
