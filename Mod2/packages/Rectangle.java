package Mod2.packages;

import java.util.Scanner;

import Mod2.utilities.ShapeUtils;

public class Rectangle implements ShapeUtils {
    private double length;
    private double breadth;

    Rectangle(double length,double breadth){
        this.breadth= breadth;
        this.length= length;
    }

    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return 2*(length+breadth);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the legnth of the rectangle");
        double legnth = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle");
        double breadth = sc.nextDouble();
        sc.close();

        Rectangle rectangle = new Rectangle(legnth, breadth);
        System.out.println("The area of rectangle is "+rectangle.area());
        System.out.println("The perimeter of rectangle is "+rectangle.perimeter());
    }
}
