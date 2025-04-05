package Mod2.packages;

import java.util.Scanner;
import Mod2.utilities.ShapeUtils;

public class Circle implements ShapeUtils {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the interface methods
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();
        sc.close();

        Circle circle = new Circle(radius);
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());
    }
}
