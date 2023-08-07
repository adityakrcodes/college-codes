/*In a college first year class are having the following attributes Name of the class 
(BCA, BCom,BSc), 
Name of the staff 
No of the students in the class
Array of students in the class 
Define a class called first year with above attributes and define a suitable constructor. 
Also write a method called best Student () which process a first-year object and return the student with the
highest total mark. In the main method define a first-year object and find the best student of this class */
import java.util.*;

class firstyear{
    String classname;
    String classteacher;
    String stdnames[]=new String[50];
    int stdcnt;
    int stdmarks[]=new int[50];
    Scanner sc=new Scanner(System.in);
    public firstyear(){
        getinfo();
    }
    public void getinfo(){
        System.out.println("Enter the class name: ");
        classname=sc.nextLine();
        System.out.println("Enter the class teacher name: ");
        classteacher=sc.nextLine();
        System.out.println("Enter the total number of students of the class: ");
        stdcnt = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the name of all the students of the class: ");
        for(int i=0;i<stdcnt;i++){
            stdnames[i]=sc.nextLine();
        }
        System.out.println("Enter the marks of all the students of the class: ");
        for(int i=0;i<stdcnt;i++){
            stdmarks[i]=sc.nextInt();
        }
    }
    public void beststudent(){
        int best=0, k=-1;
        for(int i=0;i<stdcnt;i++){
            if(stdmarks[i]>best){
                best=stdmarks[i];
                k=i;
            }
        }
        System.out.println("The best student is "+stdnames[k]);
    }
}

public class best_student {
    public static void main(String args[]){
        firstyear fy=new firstyear();
        fy.beststudent();
    }
}
