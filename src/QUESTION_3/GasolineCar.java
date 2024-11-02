package QUESTION_3;

// Subclass for gasoline cars
class GasolineCar extends Car {
    private int horsepower;

    public GasolineCar(String brand, String model, int horsepower) {
        super(brand, model);
        this.horsepower = horsepower;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Horsepower: " + horsepower + " hp");
    }
}