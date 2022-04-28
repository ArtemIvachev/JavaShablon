package Command;

public class Main {
    public static void main(String[] args) {
        Controller tr = new Controller();

        Command switchTurnUp = new TurnOnTVCommand(tr);
        Command switchTurnDown = new TurnOffTVCommand(tr);
        Command switchAddUp = new IncreaseSoundTVCommand(tr);
        Command switchAddDown = new ReduceSoundTVCommand(tr);

        Switch s = new Switch(switchTurnUp, switchTurnDown, switchAddUp, switchAddDown);

        s.flipUp();
        s.flipDown();
        s.addUp();
        s.addDown();
    }
}
