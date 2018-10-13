package transport;

abstract class Sea extends Transport {
    int countOfBlade;

    public Sea(String name, int countPassengers, int capacityCargo, int speed, int costPerKilometr, int countOfBlade) {
        super(name, countPassengers, capacityCargo, speed, costPerKilometr);
        this.countOfBlade = countOfBlade;
    }
}
