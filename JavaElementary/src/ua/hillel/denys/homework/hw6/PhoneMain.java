package ua.hillel.denys.homework.hw6;

import ua.hillel.denys.homework.hw6.dto.Phone;
import ua.hillel.denys.homework.hw6.service.PhoneService;
import ua.hillel.denys.homework.hw6.service.impl.PhoneServiceImpl;
import ua.hillel.denys.homework.hw6.utils.GenPhone;

/**
 * JavaDoc
 *
 * Создать классы, спецификации которых приведены ниже.
 * Определить конструкторы и методы setТип(), getТип(), toString().
 *
 * Phone: id, Фамилия, Имя, Отчество, Адрес, Номер телфона, Номер кредитной карточки,
 * Дебет, Кредит, Время городских , время междугородных разговоров, трафик интернета
 *
 * Создать интерфейс и его реализацию для выборки данных и вывести эти данные на консоль.
 *
 * a) сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
 * b) сведения об абонентах, которые пользовались междугородной связью;
 * c) сведения об абонентах в алфавитном порядке.
 * д) сведения об первых 10 абонентов у который самый большой трафик интернета
 *
 * @author Tarasiuk Denys
 */

public class PhoneMain {

    public static void main(String[] args) {

        Phone[]phones = new GenPhone().getPhones();
        PhoneService sub = new PhoneServiceImpl();

        System.out.println("==========");
        System.out.println("Сведения об абонентах, у которых время внутригородских разговоров превышает заданное");
        sub.timeForLocalCalls(phones, 100.0);

        System.out.println("==========");
        System.out.println("Сведения об абонентах, которые пользовались междугородной связью");
        sub.intercityCommunications(phones);

        System.out.println("==========");
        System.out.println("Сведения об абонентах в алфавитном порядке");
        sub.inAlphabetOrder(phones);

        System.out.println("==========");
        System.out.println("Сведения об первых 10 абонентов у который самый большой трафик интернета");
        sub.maxInternetTraffic(phones);


    }
}
