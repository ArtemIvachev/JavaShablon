package Command;

public class Switch {
    private Command flipUpCommand;
    private Command flipDownCommand;
    private Command addUpCommand;
    private Command addDownCommand;

    public Switch(Command flipUpCommand, Command flipDownCommand, Command addUpCommand, Command addDownCommand) {
        this.flipUpCommand = flipUpCommand;
        this.flipDownCommand = flipDownCommand;
        this.addUpCommand = addUpCommand;
        this.addDownCommand = addDownCommand;
    }

    public void flipUp(){
        flipUpCommand.execute();
    }

    public void flipDown(){
        flipDownCommand.execute();
    }

    public void addUp(){
        addUpCommand.execute();
    }

    public void addDown(){
        addDownCommand.execute();
    }
}
