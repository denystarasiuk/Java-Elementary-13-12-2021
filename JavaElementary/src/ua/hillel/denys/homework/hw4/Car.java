package ua.hillel.denys.homework.hw4;

public class Car {
    private static double ADDITIONALLY; //Кол-во дозалитого топлива
    private double tankVolume;  // объем бака
    private double residueInTheTank;    // остаток в баке
    private double fuelConsumption; // расход топлива на 100 км

    public Car(double tankVolume, double residueInTheTank, double fuelConsumption) {
        this.tankVolume = tankVolume;
        this.residueInTheTank = residueInTheTank;
        this.fuelConsumption = fuelConsumption;
    }

    // залить полный бак с учетом объема остатка
    public double fillFullTank() {
        double difference = tankVolume - residueInTheTank;
        System.out.println("До полного бака долили топлива: " + (difference) + " л.");
        ADDITIONALLY += difference;
        return residueInTheTank = tankVolume;
    }

    // определить остаток топлива по преодолении N км
    public double remainingFuelAfterTheTrip(double N) {
        double remainingFuelAfterTheTrip = residueInTheTank - (N * (fuelConsumption / 100));
        System.out.println("Остаток топлива по преодолении " + N + " км: " + remainingFuelAfterTheTrip + " л.");
        return residueInTheTank = remainingFuelAfterTheTrip;
    }

    // определить сколько надо до заправить топлива при преодолении N км
    public double howMuchFuelToFill(double N) {
        double howMuchFuelToFill = N * (fuelConsumption / 100);
            System.out.println("Для проезда " + N + " км пути, необходимо дозаправить: " + howMuchFuelToFill + " л.");
            return howMuchFuelToFill;
    }

    public double getADDITIONALLY() {
        return ADDITIONALLY;
    }

}
