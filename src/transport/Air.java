package transport;

abstract class Air extends Transport {
    int countOfEngines;
    boolean isReactiveEngine;

    public Air(String name, int countPassengers, int capacityCargo, int speed, int costPerKilometr, int countOfEngines, boolean isReactiveEngine) {
        super(name, countPassengers, capacityCargo, speed, costPerKilometr);
        this.countOfEngines = countOfEngines;
        this.isReactiveEngine = isReactiveEngine;
    }
}
