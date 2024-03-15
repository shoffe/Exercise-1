package OOP;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
    String name;
    String position;
    int idEmploy;

    public Employee(String name, String position, int idEmploy) {
        this.name = name;
        this.position = position;
        this.idEmploy = idEmploy;
    }

    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public int getIdEmploy() {
        return idEmploy;
    }
}

class Department {
    private List<Employee> objectList;

    public Department() {
        this.objectList = new ArrayList<>();
    }

    public void addEmploy(Employee obj) {
        objectList.add(obj);
    }

    public void delEmploy(Employee obj) {
        objectList.remove(obj);
    }

    public List<Employee> allEmploy() {
        return objectList;
    }

    private Employee findEmployById(int id) {
        for (Employee employee : objectList) {
            if (employee.idEmploy == id) {
                return employee;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Department department = new Department();

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить работника");
            System.out.println("2. Удалить работника");
            System.out.println("3. Посмотреть всех работников");
            System.out.println("4. Выйти");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите имя работника:");
                    String name = scanner.next();
                    System.out.println("Введите его специальность:");
                    String position = scanner.next();
                    System.out.println("Введите его ID:");
                    int id = scanner.nextInt();
                    Employee employee = new Employee(name, position, id);
                    department.addEmploy(employee);
                    System.out.println("Работник успешно добавлен.");
                    break;
                case 2:
                    System.out.println("Введите ID работника для удаления:");
                    int removeId = scanner.nextInt();
                    Employee removeEmployee = department.findEmployById(removeId);
                    if (removeEmployee != null) {
                        department.delEmploy(removeEmployee);
                        System.out.println("Работник удален.");
                    } else {
                        System.out.println("Работник с указанным ID не найден.");
                    }
                    break;
                case 3:
                    System.out.println("Все работники:");
                    for (Employee emp : department.allEmploy()) {
                        System.out.println(emp.getName() + ", " + emp.getPosition() + ", ID: " + emp.getIdEmploy());
                    }
                    break;
                case 4:
                    System.out.println("Выход...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Неправильный выбор. Попробуйте еще раз");
            }
        }
    }
    }
