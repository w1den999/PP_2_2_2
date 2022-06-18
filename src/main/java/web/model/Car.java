package web.model;

public class Car {
    private String brand;
    private int serial;
    private String color;

    public Car(String brand, int serial, String color) {
        this.brand = brand;
        this.serial = serial;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
