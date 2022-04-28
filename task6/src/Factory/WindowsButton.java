package Factory;

public class WindowsButton implements Button{
    @Override
    public void drawButton() {
        System.out.println("Отрисовка WindowsButton");
    }
}

