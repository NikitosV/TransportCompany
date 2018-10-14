package transport;

public class CargoCar extends Terrestrial {
    private int cargoCapacity;

    public CargoCar(String name, int speed, int costPerKilometr, int fuelCapacity, int countOfWeels, int cargoCapacity) {
        super(name, speed, costPerKilometr, fuelCapacity, countOfWeels);
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
        return "CargoCar{" +
                "cargoCapacity=" + cargoCapacity +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", costPerKilometr=" + costPerKilometr +
                ", fuelCapacity=" + fuelCapacity +
                '}';
    }
}