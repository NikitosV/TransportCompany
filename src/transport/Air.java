package transport;

public abstract class Air extends Transport {
    int countOfEngines;
    boolean isReactiveEngine;

    public Air(String name, int speed, int costPerKilometr, int fuelCapacity, int countOfEngines, boolean isReactiveEngine) {
        super(name, speed, costPerKilometr, fuelCapacity);
        this.countOfEngines = countOfEngines;
        this.isReactiveEngine = isReactiveEngine;
    }
}
