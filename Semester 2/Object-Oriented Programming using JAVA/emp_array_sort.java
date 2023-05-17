import java.util.Arrays;

public class emp_array_sort {
    public static void main(String[] args){
        Employee[] staff = new Employee[10];
        staff[0] = new Employee("Krishna", 40000);
        staff[1] = new Employee("Ram", 60000);
        staff[2] = new Employee("Arjun", 50000);
        staff[3] = new Employee("Bheem", 70000);
        staff[4] = new Employee("Nakul", 30000);
        staff[5] = new Employee("Sahadev", 20000);
        staff[6] = new Employee("Duryodhan", 10000);
        staff[7] = new Employee("Dushasan", 80000);
        staff[8] = new Employee("Karna", 90000);
        staff[9] = new Employee("Shakuni", 100000);

        Arrays.sort(staff); // Sort the staff array

        for (int i = 0; i < 10; i++)
            staff[i].print();
    }
}

class Employee implements Comparable<Employee> {
    String name;
    double salary;

    public Employee(String n, double s){
        name = n;
        salary = s;
    }

    public void print(){
        System.out.println(name + " " + salary);
    }

    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }
}
