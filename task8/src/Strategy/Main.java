package Strategy;

public class Main {
    public static void main(String[] args) {
        ToyotaCar toyotaCamry = new ToyotaCamry();
        toyotaCamry.performDrive();
        toyotaCamry.setDrivable(new RearWheelDrive());
        toyotaCamry.performDrive();
    }
}
