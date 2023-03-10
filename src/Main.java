import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int id = 0;
        for (int i = 0; i < 10; i++) {
            id = id + 1;
        }


        Employee[] employee = new Employee[10];
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

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }

        double total = 0;
        for (int i = 0; i < employee.length; i++) {
            total += employee[i].getSalary();
        }
        System.out.println("Сумма затрат за месяц " + total);

        double max = -1;
        String fio = null;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > max) {
                max = employee[i].getSalary();
                fio = employee[i].getFio();
            }
        }
        System.out.println("Максимальная выплата у сотрудника " + fio + " " + max);

        double min = 80000;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < min) {
                min = employee[i].getSalary();
                fio = employee[i].getFio();
            }
        }
            System.out.println("Минимальная выплата сотруднику " + fio + " " + min);

            double medium = total / employee.length;
            System.out.println("Средняя выплата составляет " + medium);

            Employee getFio = null;
            for (int i = 0; i < employee.length; i++){
                System.out.println(employee[i].getFio());
            }


        }

    }




