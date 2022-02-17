package ua.hillel.denys.homework.hw6.utils;

import ua.hillel.denys.homework.hw6.dto.Phone;

public class GenPhone {

    public Phone[] getPhones(){
        Phone[] phones = new Phone[10];
        phones[0] = new Phone(25, "Ivanov", "Ivan", "Ivanovich", "Odessa", "+380956871245", "5555 1234 9876 1234", 256.2, 78.8, 30.2, 89.0, 30.0);
        phones[1] = new Phone(10, "Petrov", "Peter", "Petrovich", "Kherson", "+380967894523", "5556 2587 0147 9852", 150.0, 10.0, 120.0, 20.0, 4.0);
        phones[2] = new Phone(16, "Shust", "Irina", "Olegovna", "Dnepr", "+380951235678", "5566 7530 0258 4561", 65.5, 11.0, 11.2, 2.0, 2.0);
        phones[3] = new Phone(5, "Sidorova", "Marina", "Igorevna", "Izmail", "+380508526341", "5698 7410 0202 3656", 2000.5, 1000.5, 600.8, 200.0, 25.0);
        phones[4] = new Phone(23, "Solodov", "Igor", "Igorovich", "Odessa", "+380989638541", "5987 0258 4678 0212", 489.1, 90.5, 120.2, 0.0, 10.0);
        phones[5] = new Phone(31, "Muslin", "Nadegda", "Petrovna", "Izmail", "+380661592648", "5025 7412 9025 1325", 2895.9, 950.2, 450.0, 350.0, 8.0);
        phones[6] = new Phone(4, "Nikolaev", "Nikolay", "Nikolaevich", "Kharkiv", "+380953579821", "5656 0454 9098 6598", 205.2, 25.3, 29.0, 4.0, 9.0);
        phones[7] = new Phone(8, "Pshonka", "Svetlana", "Pavlovna", "Lviv", "+380972486517", "5695 0856 9870 0304", 135.2, 35.1, 18.0, 0.0, 11.0);
        phones[8] = new Phone(28, "Vasilevskiy", "Vasiliy", "Vasilievich", "Odessa", "+380960245789", "5087 4873 3652 0145", 500.0, 400.2, 158.8, 0.0, 5.0);
        phones[9] = new Phone(11, "Stepanenko", "Inna", "Dmitrievna", "Ternopil", "+38099581274", "5320 0985 7530 9514", 650.1, 80.5, 200.0, 0.0, 2.0);
        return phones;
    }
}
