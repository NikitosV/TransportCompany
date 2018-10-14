package transport.sea;

import transport.Sea;

public class Tanker extends Sea {
    private int cargoCapacity;

    public Tanker(String name, int speed, int costPerKilometr, int fuelCapacity, int countOfBlade) {
        super(name, speed, costPerKilometr, fuelCapacity, countOfBlade);
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return "Грузовой танкер{" +
                "Назание='" + name +
                ", Скорость=" + speed +
                ", Стоимость л.км=" + costPerKilometr +
                ", Запас топлива=" + fuelCapacity +
                ", Количество груза=" + cargoCapacity +
                '}';
    }
}