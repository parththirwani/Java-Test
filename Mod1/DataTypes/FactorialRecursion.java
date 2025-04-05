package Mod1.DataTypes;

import java.util.Scanner;

public class FactorialRecursion {
    public static long factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find factorial: ");
        int n = sc.nextInt();

        if(n<0){
            System.out.println("The number entered should be more than 0 or 0");
        }else{
            long result = factorial(n);
            System.out.println("The factorial of given number is "+result);
        }
        sc.close();
    }

    
}
