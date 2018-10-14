package transport.terrestrial;

import transport.Terrestrial;

public class CargoCar extends Terrestrial {
    private int cargoCapacity;

    public CargoCar(String name, int speed, int costPerKilometr, int fuelCapacity, int countOfWeels) {
        super(name, speed, costPerKilometr, fuelCapacity, countOfWeels);
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль{" +
                "Назание='" + name +
                ", Скорость=" + speed +
                ", Стоимость л.км=" + costPerKilometr +
                ", Запас топлива=" + fuelCapacity +
                ", Количество груза=" + cargoCapacity +
                '}';
    }
}