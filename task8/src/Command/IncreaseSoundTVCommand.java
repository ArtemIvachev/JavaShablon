package Command;

public class IncreaseSoundTVCommand implements Command{
    private Controller theController;

    public IncreaseSoundTVCommand(Controller theController) {
        this.theController = theController;
    }

    @Override
    public void execute() {
        theController.increaseSound();
    }
}