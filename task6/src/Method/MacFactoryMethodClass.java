package Method;

public class MacFactoryMethodClass extends FactoryMethodClass{
    @Override
    public Button createButton() {
        return new MacButton();
    }
}