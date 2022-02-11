package ua.hillel.denys.homework.hw6.service;

import ua.hillel.denys.homework.hw6.dto.Phone;

public interface PhoneService {

    void timeForLocalCalls(Phone[]phones, double cityTalkTime);

    void intercityCommunications(Phone[]phones);

    void inAlphabetOrder(Phone[]phones);

    void maxInternetTraffic(Phone[]phones);
}
