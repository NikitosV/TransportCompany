package transport.terrestrial;

import transport.Terrestrial;

public class LightCar extends Terrestrial {

    public LightCar(String name, int speed, int costPerKilometr, int fuelCapacity, int countOfWeels) {
        super(name, speed, costPerKilometr, fuelCapacity, countOfWeels);
    }

    @Override
    public String toString() {
        return "Легковой автомобиль{" +
                "Название='" + name + '\'' +
                ", Скорость=" + speed +
                ", Стоимость л.км=" + costPerKilometr +
                ", Запас топлива=" + fuelCapacity +
                '}';
    }
}