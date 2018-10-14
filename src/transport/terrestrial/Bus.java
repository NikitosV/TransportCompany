package transport.terrestrial;

import transport.Terrestrial;

public class Bus extends Terrestrial {
    private int countPassengers;

    public Bus(String name, int speed, int costPerKilometr, int fuelCapacity, int countOfWeels) {
        super(name, speed, costPerKilometr, fuelCapacity, countOfWeels);
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public String toString() {
        return "Автобус{" +
                "Назание='" + name +
                ", Скорость=" + speed +
                ", Стоимость л.км=" + costPerKilometr +
                ", Запас топлива=" + fuelCapacity +
                ", Количество пассажиров=" + countPassengers +
                '}';
    }
}