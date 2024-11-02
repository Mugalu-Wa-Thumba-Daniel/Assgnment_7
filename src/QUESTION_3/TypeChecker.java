package QUESTION_3;

// Utility class to verify the type of car
class TypeChecker {
    public void identifyCarType(Car car) {
        if (car instanceof GasolineCar) {
            System.out.println("Gasoline car");
        } else if (car instanceof DieselCar) {
            System.out.println("Diesel car");
        } else if (car instanceof ElectricCar) {
            System.out.println("Electric car");
        }
    }
}