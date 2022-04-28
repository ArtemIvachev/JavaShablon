package Method;

public class WindowsFactoryMethodClass extends FactoryMethodClass{
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}