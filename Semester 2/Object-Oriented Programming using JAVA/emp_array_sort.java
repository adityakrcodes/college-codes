import java.util.Arrays;

public class emp_array_sort {
    public static void main(String[] args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Krishna", 40000);
        staff[1] = new Employee("Ram", 60000);
        staff[2] = new Employee("Arjun", 50000);

        Arrays.sort(staff); // Sort the staff array

        for (int i = 0; i < 3; i++)
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
