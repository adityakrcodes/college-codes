
/*In a college first year class are having the following attributes 
Name of the class (BCA, BCom, BSc), 
Name of the staff 
No of the students in the class, 
Array of students in the class,
After entering the value display the output.
 */
import java.util.Scanner;

public class first_year_class {
    String className;
    String classTeacherName;
    int studentCount;
    String studentName[] = new String[50];
    Scanner sc = new Scanner(System.in);

    public first_year_class() {
        getInfo();
    }

    private void getInfo() {
        System.out.println("Please Enter the Class Name");
        className = sc.nextLine();

        System.out.println("Please Enter Class Teacher Name");
        classTeacherName = sc.nextLine();

        System.out.println("Please enter total number of students in the class");
        studentCount = Integer.parseInt(sc.nextLine());

        System.out.println("Please enter names of all" + studentCount + "students in the class");

        for (int i = 0; i < studentCount; i++) {
            studentName[i] = sc.nextLine();
        }
    }

    public void display() {
        System.out.println("Class Name: " + className);
        System.out.println("Class Teacher Name:" + classTeacherName);

        System.out.println(" **Student Names** ");

        for (int i = 0; i < studentCount; i++) {
            System.out.println(studentName[i]);
        }
    }

    public static void main(String args[]) {
        first_year_class fy = new first_year_class();
        fy.display();
    }
}