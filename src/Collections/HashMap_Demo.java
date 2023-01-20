package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Demo {
    public static void main(String args[]){
        HashMap<Integer,String> hMap=new HashMap<>();
        hMap.put(101,"Clari5");
        hMap.put(105,"Sudeep");
        hMap.put(111,"Bangalore");

        System.out.println("HashMap elements: ");
        for(Map.Entry mEntry : hMap.entrySet()){
            System.out.print("key: "+ mEntry.getKey() + " & Value: ");
            System.out.println(mEntry.getValue());
        }
    }
}
