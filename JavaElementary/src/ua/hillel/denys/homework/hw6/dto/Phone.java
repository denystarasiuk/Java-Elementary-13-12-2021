package ua.hillel.denys.homework.hw6.dto;

public class Phone {

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String tel;
    private String creditCardNumber;
    private double debit;
    private double credit;
    private double cityTalkTime;
    private double longDistanceCallTime;
    private double internetTraffic;

    public Phone(int id, String surname, String name, String patronymic, String address, String tel, String creditCardNumber, double debit, double credit, double cityTalkTime, double longDistanceCallTime, double internetTraffic) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.tel = tel;
        this.creditCardNumber = creditCardNumber;
        this.debit = debit;
        this.credit = credit;
        this.cityTalkTime = cityTalkTime;
        this.longDistanceCallTime = longDistanceCallTime;
        this.internetTraffic = internetTraffic;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public double getDebit() {
        return debit;
    }

    public double getCredit() {
        return credit;
    }

    public double getCityTalkTime() {
        return cityTalkTime;
    }

    public double getLongDistanceCallTime() {
        return longDistanceCallTime;
    }

    public double getInternetTraffic() {
        return internetTraffic;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void setCityTalkTime(double cityTalkTime) {
        this.cityTalkTime = cityTalkTime;
    }

    public void setLongDistanceCallTime(double longDistanceCallTime) {
        this.longDistanceCallTime = longDistanceCallTime;
    }

    public void setInternetTraffic(double internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", debit=" + debit +
                ", credit=" + credit +
                ", cityTalkTime=" + cityTalkTime +
                ", longDistanceCallTime=" + longDistanceCallTime +
                ", internetTraffic=" + internetTraffic +
                '}';
    }
}
