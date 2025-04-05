package Mod1.Arrays;

import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the legnth of the array:");
        int legnth= sc.nextInt();
        int[] arr= new int[legnth];

        System.out.println("Enter the elements of the array:");
        for(int i=0;i<legnth;i++){
            arr[i]= sc.nextInt();
        }
        sc.close();

        int max = arr[0];

        for(int i=1;i<legnth;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The largest number is: "+max);
        sc.close();
    }
}
