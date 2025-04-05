package Mod1.OOPS;

class Animals{
    void speak(){
        System.out.println("blah blah");
    }

    void speak(String mood){
        System.out.println("The animal is "+ mood);
    }

    class Dog extends Animals{
        void speak(){
            System.out.println("bhaw bhaw");
        }
        void speak(int times){
            System.out.println("Dog bhawed"+times+" times");
        }
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        Animals animals = new Animals();
        Animals.Dog dog = animals.new Dog();

        animals.speak();
        animals.speak("Happy");

        dog.speak();
        dog.speak(5);
    }
}
