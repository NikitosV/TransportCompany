package transport.sea;

import transport.Sea;

public class Boat extends Sea {
    public Boat(String name, int speed, int costPerKilometr, int fuelCapacity, int countOfBlade) {
        super(name, speed, costPerKilometr, fuelCapacity, countOfBlade);
    }

    @Override
    public String toString() {
        return "Лодка{" +
                "Название='" + name + '\'' +
                ", Скорость=" + speed +
                ", Стоимость л.км=" + costPerKilometr +
                ", Запас топлива=" + fuelCapacity +
                '}';
    }
}