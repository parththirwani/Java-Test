package Mod2.packages;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerList{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to add to the list and press -1 to stop adding");

        while(true){
            int num = sc.nextInt();
            if(num==-1){
                break;
            }
            numbers.add(num);

            }
            System.out.println("The numbers you entered are: ");
            for(int number: numbers){
                System.out.println(number);

        }
        sc.close();

    }
}

