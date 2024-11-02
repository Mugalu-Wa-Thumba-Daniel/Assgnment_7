package QUESTION_3;

// Parent class for cars
class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    // Final method to display a generic message
    public final void displayMessage() {
        System.out.println("Generic car");
    }
}