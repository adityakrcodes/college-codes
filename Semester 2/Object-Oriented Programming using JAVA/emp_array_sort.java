import java.util.*;

class employee {
    String name;
    Date appdate;

    public employee(String nm, Date apdt) {
        name = nm;
        appdate = apdt;
    }

    public void display() {
        System.out.println("Employee Name: " + name + " Appointed Date: " + appdate.getDate() + "/"
                + (appdate.getMonth() + 1) + "/" + (appdate.getYear()));
    }
}

class emp_array_sort {
    public static void main(String[] args) {
        employee emp[] = new employee[10];
        emp[0] = new employee("Aditya Kumar", new Date(2007, 2, 12));
        emp[1] = new employee("Ansh Jaiswal", new Date(2010, 4, 15));
        emp[2] = new employee("Jason Dsouza", new Date(2020, 7, 1));
        emp[3] = new employee("Durganand", new Date(2021, 5, 11));
        emp[4] = new employee("Amit Kumar", new Date(2009, 11, 5));
        emp[5] = new employee("Raj Ranjan", new Date(2020, 5, 6));
        emp[6] = new employee("Aman Raj", new Date(2022, 12, 22));
        emp[7] = new employee("Rishit Raj", new Date(2019, 10, 30));
        emp[8] = new employee("Nikhil Kumar", new Date(2017, 4, 20));
        emp[9] = new employee("Ritu Raj", new Date(2022, 1, 10));
        for (int i = 0; i < 10; i++) {
            emp[i].display();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i - 1; j++) {
                if (emp[j].appdate.compareTo(emp[j + 1].appdate) > 0) {
                    employee temp = emp[j];
                    emp[j] = emp[j + 1];
                    emp[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted List: ");
        for (int i = 0; i < 10; i++) {
            emp[i].display();
        }
    }
}