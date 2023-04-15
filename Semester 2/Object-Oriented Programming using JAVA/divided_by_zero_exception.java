// Write a program to demonstrate a division by zero exception
public class divided_by_zero_exception {
    static int a, b;
    public static void main(String args[]) {
        a = 15;
        b = 0;
        try {
            System.out.println("The result is: " + (a / b));
        } catch (ArithmeticException ae) {
            System.out.println("Second number cannot be zero");
        }
    }
}