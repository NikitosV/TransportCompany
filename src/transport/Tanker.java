package transport;

public class Tanker extends Sea {
    private int cargoCapacity;

    public Tanker(String name, int speed, int costPerKilometr, int fuelCapacity, int countOfBlade, int cargoCapacity) {
        super(name, speed, costPerKilometr, fuelCapacity, countOfBlade);
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
                "cargoCapacity=" + cargoCapacity +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", costPerKilometr=" + costPerKilometr +
                ", fuelCapacity=" + fuelCapacity +
                '}';
    }
}