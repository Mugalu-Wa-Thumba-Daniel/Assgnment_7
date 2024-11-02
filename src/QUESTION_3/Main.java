package QUESTION_3;

// Main class to test the cars
public class Main {
    public static void main(String[] args) {
        GasolineCar gasolineCar = new GasolineCar("Peugeot", "308", 130);
        DieselCar dieselCar = new DieselCar("Renault", "Clio", 50);
        //ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", 500);

        System.out.println("\nSHOWING DETAILS OF THE FIRST CHILD CLASS : \n");
        gasolineCar.showDetails();
        gasolineCar.displayMessage();
        System.out.println();

        System.out.println("SHOWING DETAILS OF THE SECOND CHILD CLASS : \n");
        dieselCar.showDetails();
        dieselCar.displayMessage();
        System.out.println();

        /*System.out.println("SHOWING DETAILS OF THE THIRD CHILD CLASS");
        electricCar.showDetails();
        electricCar.displayMessage();
        System.out.println();*/

        System.out.println("CHECKING TYPE DETAILS OF THE FIRST CHILD CLASS : \n");
        TypeChecker verifier = new TypeChecker();
        verifier.identifyCarType(gasolineCar);
        verifier.identifyCarType(dieselCar);
        //verifier.identifyCarType(electricCar);
    }
}