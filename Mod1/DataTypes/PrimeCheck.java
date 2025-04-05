package Mod1.DataTypes;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int num = sc.nextInt();
        int i = 2;
        boolean isPrime = true;

        // Edge case check
        if (num <= 1) {
            isPrime = false;
        } else {
            while (i <= num / 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(num + " is a Prime Number ");
        } else {
            System.out.println(num + " is NOT a Prime Number ");
        }

        sc.close();
    }
}
