package Mod1.OOPS;

 class Student{
    private String name;
    private int age;


    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name= newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if (newAge>18){
            this.age= newAge;
        }else{
            System.out.println("You are under age");
        }
    }   
}   
public class Encapsulation{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Parth");
        s1.setAge(15);

        // Get values using getter methods
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());
    }
}