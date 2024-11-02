package QUESTION_1;

// Concrete subclass 2: Diesel QUESTION_1.Car
public class DieselCar extends Car {
    private int tankCapacity;

    public DieselCar(String brand, String model, int year, int tankCapacity) {
        super(brand, model, year);
        this.tankCapacity = tankCapacity;
    }

    @Override
    public void displayCharacteristics() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Tank Capacity: " + tankCapacity + " liters");
    }
}
