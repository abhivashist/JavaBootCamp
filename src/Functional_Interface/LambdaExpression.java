package Functional_Interface;

import java.util.*;
@FunctionalInterface
interface PersonalGreet{
    String greeting(String name);
}
 class Demo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("May I please know your Name?");
        String name = sc.next();
        PersonalGreet hello = (String temp) -> "Hello! "+temp;
        System.out.println(hello.greeting(name));
    }
}
