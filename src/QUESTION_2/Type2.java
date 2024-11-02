package QUESTION_2;

// Classe Type2 (Diesel Car)
public class Type2 implements ComportementObjet {
    private int attribute = 200; // Engine power
    private String detail2 = "Diesel Engine"; // Engine type

    @Override
    public void performAction() {
        System.out.println("Diesel Car: Start");
    }

    @Override
    public void stopAction() {
        System.out.println("Diesel Car: Stop");
    }

    @Override
    public int getAttribute() {
        return attribute;
    }

    @Override
    public String getType() {
        return "Diesel Car";
    }

    public String getDetail2() {
        return detail2;
    }
}