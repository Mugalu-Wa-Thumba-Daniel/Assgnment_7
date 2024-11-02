package QUESTION_2;

// Classe Type1 (Gasoline Car)
public class Type1 implements ComportementObjet {
    private int attribute = 100; // Engine power
    private String detail1 = "Gasoline Engine"; // Engine type

    @Override
    public void performAction() {
        System.out.println("Gasoline Car: Start");
    }

    @Override
    public void stopAction() {
        System.out.println("Gasoline Car: Stop");
    }

    @Override
    public int getAttribute() {
        return attribute;
    }

    @Override
    public String getType() {
        return "Gasoline Car";
    }

    public String getDetail1() {
        return detail1;
    }
}