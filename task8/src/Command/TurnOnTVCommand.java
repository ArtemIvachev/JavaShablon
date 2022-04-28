package Command;

public class TurnOnTVCommand implements Command {
    private Controller theController;

    public TurnOnTVCommand(Controller theController) {
        this.theController = theController;
    }

    @Override
    public void execute() {
        theController.turnOn();
    }
}
