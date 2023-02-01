package PreviousCodes;

class Clari5_Emp {
     static String company = "Clari5";
     int emp_no;
     String doj;
     String name;
     int holidays;
     String manager;
     String report;

     void getInfo() {
         System.out.println("\n\n\n\t\t\t Welcome to "+company+" \n" + " Hii " + name+ "\n Your Employee ID : "+emp_no+ "\n DOJ : "+doj+
                             "\n Leaves Remaining : "+holidays+ "\n Your manager is : "+manager+"\n Reporting to : "+report   );
     }
 }

class Product_team extends Clari5_Emp {
    static String team = "clari5.Product";       //Static variable
    String tech;                          //Instance variable
    int no_of_people;

    void getInfo() {
        System.out.println("\n\n\n\t\t\t Welcome to " + team + " team \n" + " Hii " + name + "\n Your Employee ID : " + emp_no + "\n DOJ : " + doj +
                        "\n Leaves Remaining : " + holidays + "\n Your manager is : " + manager + "\n Reporting to : " + report +
                "\n Your Tech Stack : " + tech + "\n Team Enum.Size : " + no_of_people + " people");
    }
}
