package transport.terrestrial;

import transport.Terrestrial;

public class CargoCar extends Terrestrial {
    private int cargoCapacity;

    public CargoCar(String name, int speed, int costPerKilometr, int fuelCapacity, int countOfWeels) {
        super(name, speed, costPerKilometr, fuelCapacity, countOfWeels);
    }
}