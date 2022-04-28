package com.company;
import java.util.Scanner;
import java.util.function.Predicate;

public class PowerOfTwo {

    public static void main(String[] args) {

        Predicate<Integer> tester = x -> x == 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = in.nextInt();
        int mem = x;
        while (x != 1 && x % 2 == 0 && x > 0) {
            x /= 2;
        }
        System.out.println(mem + " является степенью двойки? " + tester.test(x));
    }
}