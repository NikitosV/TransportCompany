package transport;

abstract class Transport {
    String name;
    int countPassengers;
    int capacityCargo;
    int speed;
    int costPerKilometr;

    public Transport(String name, int countPassengers, int capacityCargo, int speed, int costPerKilometr) {
        this.name = name;
        this.countPassengers = countPassengers;
        this.capacityCargo = capacityCargo;
        this.speed = speed;
        this.costPerKilometr = costPerKilometr;
    }
}
