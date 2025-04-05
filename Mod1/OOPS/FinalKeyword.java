package Mod1.OOPS;

 final class  Animals {
    void display(){
        System.out.println("blah blah");
    }

    final String color = "white";

    void setColor(String color){
        this.color= color;
        //cannot take place
    }



    class Dog extends Animals{
        //cannot take place
    }
}

class Employee{
    final void display(){
        System.out.println("The employee name is Parth");
    }
    class EmployeeId extends Employee{
        void display(){
            System.out.println("The employee Id is 21");
            //cannot happen
        }
    }
}

