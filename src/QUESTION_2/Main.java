package QUESTION_2;

public class Main {
    public static void main(String[] args) {
        // Instantiate individual objects
        Type1 gasolineCar = new Type1();
        Type2 dieselCar = new Type2();
        Type3 electricCar = new Type3();

        // Call methods on gasolineCar object
        gasolineCar.performAction();
        System.out.println("Engine power: " + gasolineCar.getAttribute());
        System.out.println("Car type: " + gasolineCar.getType());
        System.out.println("Engine type: " + gasolineCar.getDetail1());
        gasolineCar.stopAction();
        System.out.println();

        // Call methods on dieselCar object
        dieselCar.performAction();
        System.out.println("Engine power: " + dieselCar.getAttribute());
        System.out.println("Car type: " + dieselCar.getType());
        System.out.println("Engine type: " + dieselCar.getDetail2());
        dieselCar.stopAction();
        System.out.println();

        // Call methods on electricCar object
        electricCar.performAction();
        System.out.println("Engine power: " + electricCar.getAttribute());
        System.out.println("Car type: " + electricCar.getType());
        System.out.println("Engine type: " + electricCar.getDetail3());
        electricCar.stopAction();
        System.out.println();
    }
}
