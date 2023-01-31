package clari5;

abstract class motive {

    void greetMsg(){
        System.out.println("\n\n\n        Good Day!!!!!");;
    }
    abstract void functionality();
    abstract void testing();
}

class Product extends motive {
    void functionality()
    {
        super.greetMsg();
        System.out.println("\n\n By making good products ");
    }

    void testing(){
        System.out.println("By testing the Product");
    }

}

class Operational extends motive {
    void functionality()
    {
        System.out.println("\n\n By making operation smooth ");
    }

    void testing(){
        System.out.println("By testing the existing Product");
    }
    }

    class clari5 {
    public static void main(String[] args)
    {
        Product p1 = new Product();
        p1.functionality();
        p1.testing();


        Operational o1 = new Operational();
        o1.greetMsg();
        o1.functionality();
        o1.testing();

    }
    }