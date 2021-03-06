package BuilderPackage;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        IronBuilder iron = new IronBuilder();
        director.createIronTable(iron);
        System.out.println(iron.getResult());

        WoodenBuilder woodenBuilder = new WoodenBuilder();
        director.createWoodenTable(woodenBuilder);
        System.out.println(woodenBuilder.getResult());
    }
}