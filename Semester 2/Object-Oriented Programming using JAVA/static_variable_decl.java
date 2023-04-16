/*Write a program with class variable that is available for all instances of a class. 
Use static variable declaration. Observe the changes that occur in the object’s member variable values. */

class Staticvar{
    public static int a,b;
    public void display(){
        System.out.println("A value ="+a+", B value ="+b);
    }
}

public class static_variable_decl {
    public static void main(String args[]){
        Staticvar sv=new Staticvar();
        sv.a=10;
        sv.b=20;
        sv.display();
        Staticvar sv1 = new Staticvar();
        sv1.a=10;
        sv1.b=20;
        sv1.display();
        Staticvar sv2=new Staticvar();
        sv2.display();
    }
}
