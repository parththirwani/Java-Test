package Mod2.FunctionalInterfaces;

interface Operation{
    int operate(int num);
}

public class SquareCalculator {

    public static int square(int num){
        return num*num;
    }

    public static void main(String[] args) {
        Operation squareOp = SquareCalculator::square;

        int num = 6;
        int result = squareOp.operate(num);
        System.out.println("The square of the number is "+result);
    }
}