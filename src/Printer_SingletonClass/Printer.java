package Printer_SingletonClass;

public class Printer {
    // static variable single_instance of type Printer
    private static Printer single_instance = null;

    // variable of type String
    public String printerName;

    // private constructor restricted to this class itself
    private Printer(String name) {
        this.printerName = name;
    }

    // static method to create instance of Printer class
    public static Printer getInstance(String name) {
        if (single_instance == null) {
            single_instance = new Printer(name);
        }

        return single_instance;
    }
}

 class Singleton {
    public static void main(String[] args) {
        // instantiate two objects with the same name
        Printer printer1 = Printer.getInstance("Acer");
        Printer printer2 = Printer.getInstance("Acer");

        // both objects are pointing to the same instance
        System.out.println("printer1: " + printer1.printerName);
        System.out.println("printer2: " + printer2.printerName);
        System.out.println(printer1);
        System.out.println(printer2);
        System.out.println("Same instance? " + (printer1 == printer2));
    }
}
