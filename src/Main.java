public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!");

        IfElseDemo obj = new IfElseDemo();            //Object making

        IfElseDemo.gradePoint();                      //gradePoint() is a static method hence,
                                                      // we can call it directly with class name

        obj.msg();                                    // msg() is not static so calling it with the help of object

        /*****************************************************************************
         * Below is the usage of class and object
         * Here I made a file Class_Object_demo.java file in which a class is made
         * to store the dogs information.
         *****************************************************************************/

        Class_Object_Demo Dog1 = new Class_Object_Demo();
        Dog1.breed="Maltese";
        Dog1.size="Small";
        Dog1.age=2;
        Dog1.color="white";
        System.out.println(Dog1.getInfo());

        //Another Object..................

        Class_Object_Demo Dog2 = new Class_Object_Demo();
        Dog2.breed="Labrador";
        Dog2.size="Medium";
        Dog2.age=4;
        Dog2.color="brown";
        System.out.println(Dog2.getInfo());

        /************************** INHERITANCE ***************************/

        Clari5_Emp emp1 = new Product_team();
        emp1.emp_no = 95;
        emp1.name = "Abhishek";
        emp1.doj = "02/01/2023";
        emp1.holidays = 5;
        emp1.manager = "Vidya Sagar";
        emp1.report = "Rashmi Kiran";
        emp1.getInfo();


        Product_team emp2 = new Product_team();
            emp2.emp_no = 90;
            emp2.name = "Gaurav";
            emp2.doj = "20/07/2016";
            emp2.holidays = 1;
            emp2.manager = "Ram Chaturvedi";
            emp2.report = "Shrichand";
            emp2.no_of_people = 10;
            emp2.tech = "Java";
            emp2.getInfo();





          /*!!!!!........      SUPER KEYWORD      ........!!!!!*/

        /*Clari5_Emp emp3 = new Product_team();
        emp3.emp_no = 95;
        emp3.name = "Abhishek";
        emp3.doj = "02/01/2023";
        emp3.holidays = 5;
        emp3.manager = "Vidya Sagar";
        emp3.report = "Rashmi Kiran";
        super.getInfo();*/


        /*!!!!!........      ABSTRACT CLASS      ........!!!!!*/

        motive M1 = new Product();
        M1.functionality();
        M1.testing();

        motive M2 = new Operational();
        M2.functionality();
        M2.testing();
    }

}