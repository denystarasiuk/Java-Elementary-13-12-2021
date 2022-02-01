package ua.hillel.denys.homework.hw5;

public class StudentBisLog {

    public void faculty(Student[] students, String faculty) {
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                System.out.println(student.getName() + " " + student.getSurname() + " студент факультета: " + faculty);
            }
        }
    }

    public void facultyAndCourse(Student[] students) {
        for (Student student : students) {
            if (student.getFaculty().equals("Faculty of Information Technologies")) {
                System.out.println(student.getName() + " " + student.getSurname() + " студент факультета: " + student.getFaculty() + " и курса: " + student.getCourse());
            }
        }
        for (Student student : students) {
            if (student.getFaculty().equals("Faculty of Dentistry")) {
                System.out.println(student.getName() + " " + student.getSurname() + " студент факультета: " + student.getFaculty() + " и курса: " + student.getCourse());
            }
        }
        for (Student student : students) {
            if (student.getFaculty().equals("Pharmaceutical Faculty")) {
                System.out.println(student.getName() + " " + student.getSurname() + " студент факультета: " + student.getFaculty() + " и курса: " + student.getCourse());
            }
        }
        for (Student student : students) {
            if (student.getFaculty().equals("Faculty of Construction and Architecture")) {
                System.out.println(student.getName() + " " + student.getSurname() + " студент факультета: " + student.getFaculty() + " и курса: " + student.getCourse());
            }
        }
        for (Student student : students) {
            if (student.getFaculty().equals("Faculty of Economics")) {
                System.out.println(student.getName() + " " + student.getSurname() + " студент факультета: " + student.getFaculty() + " и курса: " + student.getCourse());
            }
        }
    }

    public void yearOfBirth(Student[] students, int yearOfBirth) {
        for (Student student : students) {
            if (student.getYearOfBirth() > yearOfBirth) {
                System.out.println(student.getName() + " " + student.getSurname() + " родился после " + yearOfBirth + " года ");
            }
        }
    }

    public void group(Student[] students, String group) {
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                System.out.println(student.getName() + " " + student.getSurname() + " студент группы: " + group);
            }
        }
    }
}
