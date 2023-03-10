public class Employee {
    private String fio;
    private int department;
    private double salary;
    private int id;


public static int counter;
int getCounter = 0;



    public Employee(String fio, int department, double salary) {
        this.id = ++counter;
        this.fio = fio;
        this.department = department;
        this.salary = salary;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id:" + id + " Ф.И.О.: " + fio + " Отдел " + department + " Зарплата " + salary;
    }

}

