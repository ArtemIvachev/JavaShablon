package Method;

public class MacButton implements Button{
    @Override
    public void inActive() {
        System.out.println("Кнопка перешла в неактивное состояние");
    }

    @Override
    public void onClick() {
        System.out.println("Произошло нажатие на MacButton");
        inActive();
    }
}