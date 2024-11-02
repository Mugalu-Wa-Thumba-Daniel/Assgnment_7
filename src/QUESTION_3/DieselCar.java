package QUESTION_3;

// Subclass for diesel cars
class DieselCar extends Car {
    private int tankCapacity;

    public DieselCar(String brand, String model, int tankCapacity) {
        super(brand, model);
        this.tankCapacity = tankCapacity;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Tank capacity: " + tankCapacity + " liters");
    }
}