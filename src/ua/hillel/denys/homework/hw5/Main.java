package ua.hillel.denys.homework.hw5;

/**
 * JavaDoc
 *
 * Создать класс, спецификация которого приведена ниже.
 * Определить конструкторы и методы setТип(), getТип(), toString().
 * Определить дополнительно методы в классе, создающем массив объектов.
 * Задать критерий выбора данных и вывести эти данные на консоль.
 * В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
 *
 * Student: id, Фамилия, Имя, Отчество, Год рождения, Адрес, Телефон, Факультет, Курс, Группа.
 *
 * Создать массив из 10 объектов.
 *
 * Вывести:
 * a) список студентов заданного факультета; - Факульет
 * b) списки студентов для каждого факультета и курса; - Факультет, Группа
 * c) список студентов, родившихся после заданного года; - Год рождения
 * d) список учебной группы. - Группа
 *
 * @author Tarasiuk Denys
 */

public class Main {
    public static void main(String[] args) {

        Student[]students = new GenStudent().getStudents();
        StudentBisLog stud = new StudentBisLog();

        System.out.println("==========");
        System.out.println("Список студентов заданного факультета");
        stud.faculty(students,"Faculty of Dentistry");

        System.out.println("==========");
        System.out.println("Списки студентов для каждого факультета и курса");
        stud.facultyAndCourse(students);

        System.out.println("==========");
        System.out.println("Список студентов, родившихся после заданного года");
        stud.yearOfBirth(students, 2003);

        System.out.println("==========");
        System.out.println("Список учебной группы");
        stud.group(students, "E-21");
    }
}
