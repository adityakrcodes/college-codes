public class calculate {
    void sum (int a, int b){
        System.out.println("Sum: " + (a+b));
    }
    void sum (float a, float b){
        System.out.println("Sum: " + (a+b));
    }
    public static void main(String[] args) {
        calculate c = new calculate();
        c.sum(10, 20);
        c.sum(10.5f, 20.5f);
    }
}
