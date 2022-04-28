package Strategy;

abstract class ToyotaCar {
    private Drivable drivable;

    public void setDrivable(Drivable drivable){
        this.drivable = drivable;
    }

    public void performDrive(){
        drivable.drive();
    }
}
