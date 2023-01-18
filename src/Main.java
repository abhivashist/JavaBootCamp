public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!");

        //.................!!!!!Method Overloading.........!!!!!!
        Doctor doctorObj = new Doctor();
        // treatPatient method in class Doctor will be executed
        doctorObj.treatPatient();

        Surgeon surgeonObj = new Surgeon();
        // treatPatient  method in class Surgeon  will be executed
        surgeonObj.treatPatient();

        //..........!!!!!!!!!!!!! Abstraction!!!!!!!!!!................

        Product p1 = new Product();
        p1.functionality();
        p1.testing();


        Operational o1 = new Operational();
        o1.greetmsg();
        o1.functionality();
        o1.testing();

      //  !!!!!!!!!!...................IF-ELSE     and    STATIC................!!!!!!!!!!!!!


      IfElseDemo d1 = new IfElseDemo();
      d1.msg();
      IfElseDemo.gradePoint();    //STATIC




        //   !!!!!!!!!!!!.............CLASS and OBJECT.....!!!!!!

        Class_Object_Demo obj1 = new Class_Object_Demo();
        obj1.age =4;
        obj1.breed = "labrador";
        obj1.color = "Brown";
        obj1.size ="Medium";
        System.out.println(obj1.getInfo());

        Class_Object_Demo obj2 = new Class_Object_Demo();
        obj2.age =2;
        obj2.breed = "pug";
        obj2.color = "Brown";
        obj2.size ="small";
        System.out.println(obj2.getInfo());


        // .........!!!!!!... INHERITANCE POLYMORPHISM.......!!!!

        Clari5_Emp c1 = new Clari5_Emp();
        c1.name = "Abhishek";
        c1.doj = "02/01/2023";
        c1.emp_no = 55;
        c1.holidays = 5;
        c1.manager = "Vidya Sagar";
        c1.report = "Rashmi Kiran";
        c1.getInfo();


    }
}