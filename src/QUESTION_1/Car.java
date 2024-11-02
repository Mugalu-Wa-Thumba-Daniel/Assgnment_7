package QUESTION_1;

// Abstract class
public abstract class Car {
    protected String brand;
    protected String model;
    protected int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public abstract void displayCharacteristics();

    public double calculatePrice(int mileage) {
        return mileage * 0.1;
    }
}