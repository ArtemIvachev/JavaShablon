package Factory;

public class MacButton implements Button{
    @Override
    public void drawButton() {
        System.out.println("Отрисовка MacButton");
    }
}