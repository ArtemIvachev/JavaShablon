package Method;

public class Main {
    public static void main(String[] args) {
        FactoryMethodClass windows = new WindowsFactoryMethodClass();
        FactoryMethodClass mac = new MacFactoryMethodClass();

        windows.mainWork();
        mac.mainWork();
    }
}