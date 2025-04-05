package Mod2.Errors;

import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

    public class AgeValidator{
        public static void checkAge(int age) throws InvalidAgeException{
            if(age<18){
                throw new InvalidAgeException("The entered age is invalid");
            }else{
                System.out.println("The age is valid");
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter you current age:");
            int userAge= sc.nextInt();

            try{
                checkAge(userAge);
            }catch (InvalidAgeException e){
                System.out.println("Exception caught "+ e.getMessage());
            }
            sc.close();
        }
    }

