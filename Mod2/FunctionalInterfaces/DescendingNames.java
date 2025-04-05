package Mod2.FunctionalInterfaces;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Zara");
        names.add("Ram");
        names.add("Parth");


        Collections.sort(names, (s1,s2)-> s2.compareTo(s1));

        System.out.println("The list of the names in descending order is:");
        for(String name: names){
            System.out.println(name);

        }
    
    }


}
