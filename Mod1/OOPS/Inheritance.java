package Mod1.OOPS;

class Animals {
    public String speak() {
        return "blah blah";
    }

    // Method Overloading (different parameter)
    public String speak(String mood) {
        return "Animal is " + mood;
    }
}

class Dog extends Animals {
    @Override
    public String speak() {
        return "bhaw bhaw";
    }

    // Overloaded method
    public String speak(int times) {
        return "Dog barks " + times + " times";
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animals a = new Animals();
        Dog d = new Dog();

        System.out.println(a.speak());              // blah blah
        System.out.println(a.speak("happy"));       // Animal is happy

        System.out.println(d.speak());              // bhaw bhaw
        System.out.println(d.speak(3));             // Dog barks 3 times
    }
}
