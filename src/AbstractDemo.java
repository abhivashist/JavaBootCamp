abstract class motive {

    void greetmsg(){
        System.out.println("\n\n\n        Good Day!!!!!");;
    }
    abstract void functionality();
    abstract void testing();
}

class Product extends motive {
    void functionality()
    {
        super.greetmsg();
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
        System.out.println("By testing the Product");
    }
    }
