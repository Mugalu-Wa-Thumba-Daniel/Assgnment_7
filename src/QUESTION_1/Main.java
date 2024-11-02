package QUESTION_1;

public class Main {
    public static void main(String[] args) {
        Car gasolineCar = new GasolineCar("Peugeot", "308", 2022, 60);
        Car dieselCar = new DieselCar("Renault", "Clio", 2020, 50);
        Car electricCar = new ElectricCar("Tesla", "Model 3", 2022, 400);

        gasolineCar.displayCharacteristics();
        System.out.println("Price: $" + gasolineCar.calculatePrice(50000));

        System.out.println();

        dieselCar.displayCharacteristics();
        System.out.println("Price: $" + dieselCar.calculatePrice(30000));

        System.out.println();

        electricCar.displayCharacteristics();
        System.out.println("Price: $" + electricCar.calculatePrice(20000));
    }
}