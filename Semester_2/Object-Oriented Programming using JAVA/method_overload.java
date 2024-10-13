/*Write a java program to add two integers and two float numbers. 
When no arguments are supplied, give a default value to calculate the sum. 
Use function overloading.*/

public class method_overload {
    void sum (int a, int b){
        System.out.println("Sum: " + (a+b));
    }
    void sum (float a, float b){
        System.out.println("Sum: " + (a+b));
    }
    public static void main(String[] args) {
        method_overload c = new method_overload();
        c.sum(10, 20);
        c.sum(10.5f, 20.5f);
    }
}