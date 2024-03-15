package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private int id;

    private String name;
    private int grade;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    void printProperties() {
        System.out.println("Имя ученика: " + name);
        System.out.println("Его оценка: " + grade);
        System.out.println("Его ID: " + id);

    }

    @Override
    public String toString() {
        return "Имя ученика: " + name + "\n" +
                "Его оценка: " + grade + "\n" +
                "Его ID: " + id + "\n";
    }



    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Иванов",3));
        students.add(new Student(2, "Петров",4));
        students.add(new Student(3, "Сидоров",5));


        System.out.println("Введите номер id для поиска студента: ");
        Scanner scanner = new Scanner(System.in);
        int searchId = scanner.nextInt();


        boolean found = false;
        for (Student student : students) {
            if (student.id == searchId) {
                System.out.println(student);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Студент не найден.");
        }
    }

}
