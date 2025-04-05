package Mod2.FunctionalInterfaces;

@FunctionalInterface
interface Calculator{
    int compute(int a, int b);
}

public class CalculatorFunc{
    public static void main(String[] args) {
         
        Calculator add = (a,b)-> a+b;

        Calculator subtract = (a,b)-> a-b;

        Calculator mul = (a,b)-> a*b;

        int a = 5;
        int b= 2;

        System.out.println("The result of addition is "+ add.compute(a, b));
        System.out.println("The result of addition is "+ subtract.compute(a, b));
        System.out.println("The result of addition is "+ mul.compute(a, b));
    }
}
