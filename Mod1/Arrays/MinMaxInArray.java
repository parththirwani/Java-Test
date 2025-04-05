package Mod1.Arrays;

import java.util.Scanner;

public class MinMaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Now enter the "+n+ "numbers");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();             
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Output result
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);

        sc.close();
    }
}
