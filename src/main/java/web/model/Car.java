package web.model;

public class Car {

    private String model;
    private String brand;
    private String year;

    public Car() {
    }

    public Car(String model, String brand, String year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Brand = " +brand +
                " Model = " +model +
                " Year = " +year;
    }
}
