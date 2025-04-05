package Mod1.OOPS;

public class StringImmutability {
    public static void main(String[] args) {
        String str1 = "Parth";
        String str2 = str1; // str2 points to same object as str1

        System.out.println("Before modification:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Try to modify str1
        str1 = str1 + " Thirwani"; // This creates a new object

        System.out.println("\nAfter modification:");
        System.out.println("str1: " + str1); // Changed
        System.out.println("str2: " + str2); // Still original
    }
}
