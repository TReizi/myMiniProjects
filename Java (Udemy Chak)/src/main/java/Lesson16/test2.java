package Lesson16;

public class test2 {

}

class Employee {
    double salary;
    boolean isManager;


    Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;

    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(250,false);
        System.out.println("Он менеджер? "+ emp.isManager + " Его зарплата "+ emp.salary);
    }
}


