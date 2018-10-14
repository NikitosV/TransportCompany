package transport;

public class Tanker extends Sea {
    private int cargoCapacity;

    public Tanker(String name, int speed, int costPerKilometr, int fuelCapacity, boolean isCanFly, boolean isCanSwim, int countOfBlade, int cargoCapacity) {
        super(name, speed, costPerKilometr, fuelCapacity, isCanFly, isCanSwim, countOfBlade);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return "Tanker{" +
                "name='" + name +
                ", cargoCapacity=" + cargoCapacity +
                ", speed=" + speed +
                ", costPerKilometr=" + costPerKilometr +
                ", fuelCapacity=" + fuelCapacity +
                '}';
    }
}