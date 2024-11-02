package QUESTION_3;

// Subclass for electric cars
class ElectricCar extends Car {
    private int range;

    public ElectricCar(String brand, String model, int range) {
        super(brand, model);
        this.range = range;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Range: " + range + " miles");
    }
}