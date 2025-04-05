package Mod1.OOPS;

 class Animals {

    String color = "White";

    public void display(){
        System.out.println("I am a animal");
    }

    class Dog extends Animals{
        String color = "Black";

        public void display(){
            System.out.println("I am a dog");
        }

        public void showColors(){
            System.out.println("The color of the dog is "+this.color );
            System.out.println("The color of the animal is "+super.color );
        }

        public void showDisplay(){
            this.display();
            super.display();
        }
    }
}

public class Super{
    public static void main(String[] args) {
        Animals animals = new Animals();
        Animals.Dog dog = animals.new Dog();

        dog.showColors();
        dog.showDisplay();
    }
}

