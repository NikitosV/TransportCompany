package transport;

public abstract class Transport {
    String name;
    double speed;
    double fuelCapacity;
    double costPerKM;
    int countPassengers;
    int cargoCapacity;

    public Transport(String name, double speed, double fuelCapacity, double costPerKM, int countPassengers, int cargoCapacity) {
        this.name = name;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
        this.costPerKM = costPerKM;
        this.countPassengers = countPassengers;
        this.cargoCapacity = cargoCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCostPerKM() {
        return costPerKM;
    }

    public void setCostPerKM(double costPerKM) {
        this.costPerKM = costPerKM;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}