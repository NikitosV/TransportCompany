package transport;

abstract class Terrestrial extends Transport{
    int countOfWeels;

    public Terrestrial(String name, int countPassengers, int capacityCargo, int speed, int costPerKilometr, int countOfWeels) {
        super(name, countPassengers, capacityCargo, speed, costPerKilometr);
        this.countOfWeels = countOfWeels;
    }
}