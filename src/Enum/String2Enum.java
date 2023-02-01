package Enum;

public class String2Enum {
    public static void main(String[] args) {
        Operation operation = Operation.valueOf("minu".toUpperCase());
        System.out.println(operation);
        System.out.println(operation.calculate(100,20));
    }
}
