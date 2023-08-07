/*Write a java program to create a student class with following attributes: 
Enrollment_id,Name, Mark of sub1, Mark of sub2, mark of sub3, Total Marks. 
Total of the three marks must be calculated only when the student passes in all three subjects. 
The pass mark for each subject is 50. 
If a candidate fails in any one of the subjects his total mark must be declared as zero.
Using this condition write a constructor for this class. 
Write separate functions for accepting and displaying student details. 
In the main method create an array of three student objects and display the details. */

import java.util.*;

class student{
    Scanner sc=new Scanner(System.in);
    String Enrollment_id;
    String name;
    int sub1, sub2, sub3, total;
    student(){
        readStudentInfo();
    }
    public void readStudentInfo(){
        System.out.println("Enter Student Details: ");
        System.out.println("Enrollment ID: ");
        Enrollment_id = sc.next();
        System.out.println("Name: ");
        name = sc.next();
        System.out.println("Enter marks in 3 subjects: ");
        sub1 = sc.nextInt();
        sub2 = sc.nextInt();
        sub3 = sc.nextInt();
        if(sub1>=50 && sub2>=50&&sub3>=50){
            total = sub1+sub2+sub3;
        }
        else{
            total = 0;
        }
    }
    public void displayInfo(){
        System.out.println(Enrollment_id+"\t\t"+name+"\t"+total);
    }
}
public class student_marks {
    public static void main(String args[]){
        student s[] = new student[3];
        for(int i = 0; i<3;i++){
            s[i] = new student();
        }
        System.out.println("Student Details: ");
        System.out.println("Enrollment_id\tname\ttotal");
        for(int i=0;i<3;i++){
            s[i].displayInfo();
        }
    }    
}
