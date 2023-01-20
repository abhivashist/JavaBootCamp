package Collections;

import java.util.ArrayList;

public class ArrayList_Demo {

    public static void main(String args[]){
        ArrayList<String> arrList=new ArrayList<String>();
        arrList.add("Sachin");
        arrList.add("Tony");
        arrList.add("Lucky");
        arrList.add("Pragati");
        arrList.add("Anchal");
        arrList.add("Tanisha");

        //displaying elements
        System.out.println(arrList);

        //Adding "Steve" at the fourth position
        arrList.add(3, "Steve");

        //displaying elements
        System.out.println(arrList);
    }
}