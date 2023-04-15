/*Write a program to perform mathematical operations. 
Create a class called AddSub with methods to add and subtract. 
Create another class called MulDiv that extends from AddSub class to use the member data of the super class. 
MulDiv should have methods to multiply and divide 
A main function should access the methods and perform the mathematical operations. 
*/

class methods {
    int a = 20, b = 10;

    public void display() {
        System.out.println("Number 1 = " + a + ", Number 2 = " + b);
    }

    void add() {
        System.out.println("Sum = " + (a + b));
    }

    void sub() {
        System.out.println("Sub = " + (a - b));
    }
}

class MutiDiv extends methods {
    void multi() {
        System.out.println("Multi = " + (a * b));
    }

    void div() {
        System.out.println("Div = " + (a / b));
    }
}

public class multi_math_opt {
    public static void main(String[] args) {
        MutiDiv c = new MutiDiv();
        c.display();
        c.add();
        c.sub();
        c.multi();
        c.div();
    }
}
