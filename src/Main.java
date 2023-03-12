public class Main {
    private static Employee[] employee = new Employee[10];
    public static void main(String[] args) {
        int id = 0;
        for (int i = 0; i < 10; i++) {
            id = id + 1;
        }

        employee[0] = new Employee("Сидоров Иван Петрович", 1, 45673);
        employee[1] = new Employee("Машунина Ирина Олеговна", 4, 32754);
        employee[2] = new Employee("Егорушин Андрей Александрович", 3, 22450);
        employee[3] = new Employee("Иванова Анна Ивановна", 2, 60754);
        employee[4] = new Employee("Мишустин Сергей Викторович", 5, 48000);
        employee[5] = new Employee("Власов Сергей Николаевич", 1, 75673);
        employee[6] = new Employee("Баринов Александр Александрович", 4, 55400);
        employee[7] = new Employee("Егорова Николай Иванович", 3, 29450);
        employee[8] = new Employee("Мезей Анна Ивановна", 2, 60754);
        employee[9] = new Employee("Кобанов Сергей Викторович", 5, 80000);

        write(employee);

        System.out.println("Сумма затрат за месяц " + sumSalary(employee) + " рублей");

        System.out.println("Максимальная выплата у сотрудника : " + maximumSalary(employee) + " рублей" );

        System.out.println("Минимальная зарплата у сотрудника : " + minimumSalary(employee) + " рублей " );

        System.out.println("Средняя выплата составляет " + mediumSalary(employee));

        writeFio(employee);
    }

    public static void write(Employee[] employee){
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }
    public static double sumSalary (Employee[] employee){
        double total = 0;
        for (int i = 0; i < employee.length; i++) {
            total += employee[i].getSalary();
        }
        return total;
    }

    private static Employee maximumSalary (Employee[] employee) {
        Employee result = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (result.getSalary() < employee[i].getSalary()) {
                result = employee[i];
            }
        }
        return result;
    }

    private static Employee minimumSalary (Employee[] employee) {
        Employee result = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (result.getSalary() > employee[i].getSalary()) {
                result = employee[i];
            }
        }
        return result;
    }
    private static int mediumSalary (Employee[] employee){
        double medium = sumSalary(employee)/employee.length;
        return (int) medium;
    }
    private static void writeFio(Employee[] employee){
    Employee getFio = null;
    for (int i = 0; i < employee.length; i++){
        System.out.println(employee[i].getFio());
    }
    }

    }




