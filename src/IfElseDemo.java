import java.sql.SQLOutput;

public class IfElseDemo {

    public static void gradePoint() {

        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }

    public void msg()
    {
        System.out.println("!!!! All the best !!!!");
    }
}
