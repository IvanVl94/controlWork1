public class Employee {
    private String fio;
    private int department;
    private double salary;
    private int id;
    private static int counter = 0;

    public Employee(String fio, int department, int salary) {
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

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "id:" + id + " Ф.И.О.: " + fio + " Отдел " + department + " Зарплата " + salary;
    }

}

