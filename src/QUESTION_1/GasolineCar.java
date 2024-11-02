package QUESTION_1;

// Concrete subclass 1: Gasoline QUESTION_1.Car
public class GasolineCar extends Car {
    private int tankCapacity;

    public GasolineCar(String brand, String model, int year, int tankCapacity) {
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
