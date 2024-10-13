package BCA;
import java.util.Scanner;
public class bca_student_package{
    String name;
    String Gender;
    int age;
    public void accept() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = in.nextLine();
        System.out.println("Enter Gender: ");
        Gender = in.nextLine();
        System.out.println("Enter age of student: ");
        age = in.nextInt();
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Gender: " + Gender);
    }
}