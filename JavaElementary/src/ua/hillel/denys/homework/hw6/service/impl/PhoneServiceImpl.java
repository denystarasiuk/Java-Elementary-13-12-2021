package ua.hillel.denys.homework.hw6.service.impl;

import ua.hillel.denys.homework.hw6.dto.Phone;
import ua.hillel.denys.homework.hw6.service.PhoneService;

import java.util.Arrays;
import java.util.Comparator;

public class PhoneServiceImpl implements PhoneService {

    // сведения об абонентах, у которых время внутригородских разговоров превышает заданное
    @Override
    public void timeForLocalCalls(Phone[] phones, double cityTalkTime) {
        for (Phone phone : phones) {
            if (phone.getCityTalkTime() > cityTalkTime) {
                System.out.println(phone.getName() + " " + phone.getSurname() + ". Время внутригородских разговоров: " + phone.getCityTalkTime() + " мин., превышает заданное: " + cityTalkTime + " мин.");
            }
        }
    }

    // сведения об абонентах, которые пользовались междугородной связью
    @Override
    public void intercityCommunications(Phone[] phones) {
        for (Phone phone : phones) {
            if (phone.getLongDistanceCallTime() > 0) {
                System.out.println(phone.getName() + " " + phone.getSurname() + ". Пользовались междугородной связью");
            }
        }
    }

    // сведения об абонентах в алфавитном порядке
    @Override
    public void inAlphabetOrder(Phone[] phones) {
        Arrays.sort(phones, new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        });
        for (Phone phone : phones) {
            System.out.println(phone);
//            System.out.println(phone.getSurname() + " " + phone.getName() + " " + phone.getPatronymic() + " " + phone.getId()
//            + " " + phone.getAddress() + " " + phone.getTel() + " " + phone.getCreditCardNumber() + " " + phone.getDebit() + " " +
//                    phone.getCredit() + " " + phone.getCityTalkTime() + " " + phone.getLongDistanceCallTime() + " " + phone.getInternetTraffic());
        }
    }

    // сведения об первых 10 абонентов у который самый большой трафик интернета
    @Override
    public void maxInternetTraffic(Phone[]phones){
        Arrays.sort(phones, new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return (int) (o2.getInternetTraffic() - o1.getInternetTraffic());
            }
        });
        for (Phone phone:phones){
            System.out.println(phone);
        }
    }


}
