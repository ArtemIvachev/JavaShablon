package Composite;

public class Rectangle implements Draw{
    private String name;
    private int square;

    public Rectangle(String name, int a, int b) {
        this.name = name;
        this.square = a*b;
    }

    @Override
    public void print() {
        System.out.println("Площадь " + name + " = " + square);
    }
}