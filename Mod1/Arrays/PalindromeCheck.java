package Mod1.Arrays;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string or a int");
        String input =sc.nextLine();
        sc.close();

        String Reversed = "";

        for(int i=input.length()-1;i>=0;i--){
            Reversed += input.charAt(i);
        }
    if (input.equals(Reversed)){
        System.out.println(input+" is a palindrome");
    }else{
        System.out.println(input+" is not a palindrome");
    }

    }

}
