package QUESTION_1;

// Concrete subclass 3: Electric QUESTION_1.Car
public class ElectricCar extends Car {
    private int range;

    public ElectricCar(String brand, String model, int year, int range) {
        super(brand, model, year);
        this.range = range;
    }

    @Override
    public void displayCharacteristics() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Range: " + range + " miles");
    }
}

