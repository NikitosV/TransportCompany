package transport.sea;

import transport.Sea;

public class Tanker extends Sea {
    private int cargoCapacity;

    public Tanker(String name, int speed, int costPerKilometr, int fuelCapacity, int countOfBlade) {
        super(name, speed, costPerKilometr, fuelCapacity, countOfBlade);
    }
}