package ua.hillel.denys.homework.hw5;

public class GenStudent {

    public Student[] getStudents(){
        Student[]students = new Student[10];
        students[0] = new Student(1122, "Ivanov", "Ivan", "Ivanovich", 2001, "Odessa", "+380963332211", "Faculty of Information Technologies", "2", "IT-21");
        students[1] = new Student(1223, "Petrov", "Petr", "Petrovich", 2002, "Kherson", "+380985648978", "Faculty of Dentistry", "3", "D-31");
        students[2] = new Student(1324, "Shust", "Irina", "Olegovna", 2000, "Dnepr", "+380963251856", "Pharmaceutical Faculty", "3", "P-31");
        students[3] = new Student(1025, "Sidorova", "Marina", "Igorevna", 2003, "Izmail", "+380958524679", "Faculty of Construction and Architecture", "2", "CA-21");
        students[4] = new Student(1326, "Solodov", "Igor", "Igorevich", 2003, "Odessa", "+380966842579", "Faculty of Economics", "2", "E-21");
        students[5] = new Student(1527, "Muslina", "Nadegda", "Petrovna", 2002, "Izmail", "+380972589614", "Pharmaceutical Faculty", "4", "P-41");
        students[6] = new Student(1128, "Pshonka", "Svetlana", "Pavlovna", 2000, "Kharkiv", "+380967419652", "Faculty of Information Technologies", "3", "IT-31");
        students[7] = new Student(1329, "Nikolaev", "Nikolay", "Nikolaevich", 2001, "Lviv", "+380959876521", "Faculty of Dentistry", "4", "D-41");
        students[8] = new Student(1530, "Vasilevskiy", "Vasiliy", "Vasilievich", 2004, "Odessa", "+380996937812", "Faculty of Economics", "2", "E-21");
        students[9] = new Student(1631, "Stepanenko", "Inna", "Dmitrievna", 2000, "Ternopil", "+380662619865", "Pharmaceutical Faculty", "3", "P-31");
        return students;
    }
}
