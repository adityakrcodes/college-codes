class methods{
    int a =20, b = 10;
    public void display(){
        System.out.println("Number 1 = " + a + " Number 2 = " + b);
    }
    void add(){
        System.out.println("Sum = " + (a+b));
    }
    void sub(){
        System.out.println("Sub = " + (a-b));
    }
}
class MutiDiv extends methods{
    void multi(){
        System.out.println("Multi = " + (a*b));
    }
    void div(){
        System.out.println("Div = " + (a/b));
    }
}


public class calculater {
    public static void main(String[] args) {
        MutiDiv c = new MutiDiv();
        c.display();
        c.add();
        c.sub();
        c.multi();
        c.div();
    }
}
