package transport.terrestrial;

import transport.Terrestrial;

public class Bus extends Terrestrial {
    int countPassengers;

    public Bus(String name, int speed, int costPerKilometr, int fuelCapacity, int countOfWeels) {
        super(name, speed, costPerKilometr, fuelCapacity, countOfWeels);
    }
}
