package Composite;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle("квадрата", 2, 2);
        Rectangle rectangle2 = new Rectangle("прямоугольника", 2, 4);

        Shape shape1 = new Shape("круга1", 5);
        Shape shape2 = new Shape("круга2", 4);

        Figure figure1 = new Figure();
        Figure figure2 = new Figure();
        Figure figure3 = new Figure();

        figure1.add(rectangle1);
        figure1.add(shape2);
        figure1.print();
        System.out.println("-------------");
        figure2.add(rectangle2);
        figure2.add(shape1);
        figure2.print();
        System.out.println("-------------");
        figure3.add(shape2);
        figure3.print();
    }
}
