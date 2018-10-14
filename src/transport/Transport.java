package transport;

public abstract class Transport {
    String name;
    int speed;
    int costPerKilometr;
    int fuelCapacity;
    boolean isCanFly;
    boolean isCanSwim;

    public Transport(String name, int speed, int costPerKilometr, int fuelCapacity, boolean isCanFly, boolean isCanSwim) {
        this.name = name;
        this.speed = speed;
        this.costPerKilometr = costPerKilometr;
        this.fuelCapacity = fuelCapacity;
        this.isCanFly = isCanFly;
        this.isCanSwim = isCanSwim;
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

    public boolean isCanFly() {
        return isCanFly;
    }

    public void setCanFly(boolean canFly) {
        isCanFly = canFly;
    }

    public boolean isCanSwim() {
        return isCanSwim;
    }

    public void setCanSwim(boolean canSwim) {
        isCanSwim = canSwim;
    }
}