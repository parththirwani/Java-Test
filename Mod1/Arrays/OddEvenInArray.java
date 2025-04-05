package Mod1.Arrays;

import java.util.Scanner;

public class OddEvenInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Create array and input values
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Print array
        System.out.println("The array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
