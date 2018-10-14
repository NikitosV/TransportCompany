package transport.air;

import transport.Air;

public class SimplePlane extends Air {
    public SimplePlane(String name, int speed, int costPerKilometr, int fuelCapacity, int countOfEngines, boolean isReactiveEngine) {
        super(name, speed, costPerKilometr, fuelCapacity, countOfEngines, isReactiveEngine);
    }

    @Override
    public String toString() {
        return "Простой самолет{" +
                "Название='" + name + '\'' +
                ", Скорость=" + speed +
                ", Стоимость л.км=" + costPerKilometr +
                ", Запас топлива=" + fuelCapacity +
                '}';
    }
}
