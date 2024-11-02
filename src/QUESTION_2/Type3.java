package QUESTION_2;

// Classe Type3 (Electric Car)
public class Type3 implements ComportementObjet {
    private int attribute = 300; // Engine power
    private String detail3 = "Electric Engine"; // Engine type

    @Override
    public void performAction() {
        System.out.println("Electric Car: Start");
    }

    @Override
    public void stopAction() {
        System.out.println("Electric Car: Stop");
    }

    @Override
    public int getAttribute() {
        return attribute;
    }

    @Override
    public String getType() {
        return "Electric Car";
    }

    public String getDetail3() {
        return detail3;
    }
}