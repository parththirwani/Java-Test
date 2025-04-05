package Mod1.OOPS;

public class StringBuilderFunc {
    public static void main(String[] args) {
        // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Appending text
        sb.append(" World");
        System.out.println("After append: " + sb); // Hello World

        // Inserting text at index 6
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb); // Hello Java World

        // Replacing characters from index 6 to 10 with "Awesome"
        sb.replace(6, 10, "Awesome");
        System.out.println("After replace: " + sb); // Hello Awesome World

        // Deleting characters from index 5 to 13
        sb.delete(5, 13);
        System.out.println("After delete: " + sb); // Hello World

        // Reversing the string
        sb.reverse();
        System.out.println("After reverse: " + sb); // dlroW olleH

        // Length and Capacity
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity()); // Default 16 + original string size
    }
}
