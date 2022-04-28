package Strategy;

class ToyotaCamry extends ToyotaCar {
    public ToyotaCamry(){
        setDrivable(new FullWheelDrive());
    }
}