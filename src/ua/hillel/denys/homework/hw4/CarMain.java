package ua.hillel.denys.homework.hw4;

/**
 * JavaDoc
 * <p>
 * Создать класс машина с полями
 * - объем бака
 * - остаток в баке
 * - расход топлива на 100 км
 * <p>
 * создать методы:
 * - залить полный бак с учетом объема остатка
 * - определить остаток топлива по преодолении N км
 * - определить сколько надо до заправить топлива при преодолении N км
 * <p>
 * в классе Мейн надо определить и вывести на экран сколько надо долить топлива
 * и его стоимость если маршрут у нас Одесса - Киев
 * + 2 обязательные остановки для дозаправки Кривое Озеро и Жашков
 * + сколько будет стоить полная поездка
 * + остаток топлива в пункте назначения
 * <p>
 * стоимость топлива передавать как аргумент программы + результаты выполнения приложить скриншотом
 *
 * @author Tarasiuk Denys
 */

public class CarMain {

    public static void main(String[] args) {

        Car car = new Car(60, 17.5, 7.5);

        double fuelPricePerLiter = Double.parseDouble(args[0]); // стоимость топлива за 1 л.
        double startOdessa = 0; // Начало поездки из Одессы в км.
        double odessaToKryveOzero = 178.5; // расстояние от Одессы до Кривого Озера в км.
        double kryveOzeroToZhashkiv = 152.8; // расстояние от Кривого Озера до Жашкова в км.
        double zhashkivToKyiv = 148.2; // расстояние от Жашкова до Киева в км.
        double odessaToKyiv = odessaToKryveOzero + kryveOzeroToZhashkiv + zhashkivToKyiv; // расстояние от Одессы до Киева в км.


        System.out.println("Начало пути. Выезд из Одессы");
        car.remainingFuelAfterTheTrip(startOdessa);
        car.howMuchFuelToFill(odessaToKryveOzero);
        car.fillFullTank();
        System.out.println("==========");

        System.out.println("Путь Одесса - Кривое Озеро. Обязательная дозаправка в Кривом Озере");
        car.remainingFuelAfterTheTrip(odessaToKryveOzero);
        car.fillFullTank();
        car.howMuchFuelToFill(kryveOzeroToZhashkiv);
        System.out.println("==========");

        System.out.println("Путь Кривое Озеро - Жашков. Обязательная дозаправка в Жашкове");
        car.remainingFuelAfterTheTrip(kryveOzeroToZhashkiv);
        car.fillFullTank();
        car.howMuchFuelToFill(zhashkivToKyiv);
        System.out.println("==========");

        System.out.println("Путь Жашков - Киев");
        car.remainingFuelAfterTheTrip(zhashkivToKyiv);
        //car.fillFullTank();
        //car.howMuchFuelToFill(zhashkivToKyiv);
        System.out.println("==========");

        double sum = fuelPricePerLiter * (car.getADDITIONALLY());
        System.out.println("Всего долили топлива: " + car.getADDITIONALLY() + " л.");
        System.out.println("Стоимость долитого топлива: " + sum + " грн.");
        System.out.println("Стоимость полной поездки Одесса - Киев: " + (fuelPricePerLiter*car.howMuchFuelToFill(odessaToKyiv)) + " грн.");

    }
}

