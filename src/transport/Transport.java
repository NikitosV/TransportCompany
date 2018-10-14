package transport;

public abstract class Transport {
    String name;
    int speed;
    int costPerKilometr;
    int fuelCapacity;

    Transport(String name, int speed, int costPerKilometr, int fuelCapacity) {
        this.name = name;
        this.speed = speed;
        this.costPerKilometr = costPerKilometr;
        this.fuelCapacity = fuelCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCostPerKilometr() {
        return costPerKilometr;
    }

    public void setCostPerKilometr(int costPerKilometr) {
        this.costPerKilometr = costPerKilometr;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}