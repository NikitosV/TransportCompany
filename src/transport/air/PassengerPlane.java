package transport.air;

import transport.Air;

public class PassengerPlane extends Air {
    private int countPassengers;

    public PassengerPlane(String name, int speed, int costPerKilometr, int fuelCapacity, int countOfEngines, boolean isReactiveEngine, int countPassengers) {
        super(name, speed, costPerKilometr, fuelCapacity, countOfEngines, isReactiveEngine);
        this.countPassengers = countPassengers;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public String toString() {
        return "Пассажирский самолет{" +
                "Назание='" + name +
                ", Скорость=" + speed +
                ", Стоимость л.км=" + costPerKilometr +
                ", Запас топлива=" + fuelCapacity +
                ", Количество пассажиров=" + countPassengers +
                '}';
    }
}