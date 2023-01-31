package Functional_Interface;

import java.util.*;
@FunctionalInterface
interface Greet{
    String greeting(String name);
}
class MyClass implements Greet{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("May I please know your Name?");
        String name = sc.next();
        MyClass obj = new MyClass();
        System.out.println(obj.greeting(name));
    }
    @Override
    public String greeting(String name){
        return "Hello! "+name;
    }
}

