package Mod2.Errors;

import java.util.Scanner;

public class ArithmeticError{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First using try-catch only");


        System.out.println("Enter the numerator");
        int numerator= sc.nextInt();

        
        System.out.println("Enter the denominator");
        int denominator= sc.nextInt();

        try{
            int result= numerator/denominator;
            System.out.println("The result is "+result);
        }catch(ArithmeticException e){
            System.err.println("Error:Cant be divided by zero");
        }
                // Part 2: try-catch-finally
                System.out.println("\n=== try-catch-finally ===");
                System.out.print("Enter numerator: ");
                int a = sc.nextInt();
                System.out.print("Enter denominator: ");
                int b = sc.nextInt();
        
                try {
                    int result2 = a / b;
                    System.out.println("Result: " + result2);
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero is not allowed.");
                } finally {
                    System.out.println("This message is from the finally block. It always runs.");
                }
        
                sc.close();
    }
}