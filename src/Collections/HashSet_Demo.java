package Collections;

import java.util.HashSet;

public class HashSet_Demo {

    public static void main(String args[]) {
        // HashSet declaration
        HashSet<Integer> hSet = new HashSet<>();

        // Adding elements to the HashSet
        hSet.add(54);
        hSet.add(34);
        hSet.add(77);

        System.out.println("HashSet Elements: ");
        // Iterating HashSet
        for(Integer s: hSet){
            System.out.println(s);
        }
    }
}
