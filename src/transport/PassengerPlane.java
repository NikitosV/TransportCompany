package transport;

public class PassengerPlane extends Air{

    public PassengerPlane(String name, double speed, double fuelCapacity, double costPerKM, int countPassengers, int cargoCapacity) {
        super(name, speed, fuelCapacity, costPerKM, countPassengers, cargoCapacity);
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                "name='" + name +
                ", speed=" + speed +
                ", fuelCapacity=" + fuelCapacity +
                ", costPerKM=" + costPerKM +
                ", countPassengers=" + countPassengers +
                ", cargoCapacity=" + cargoCapacity +
                '}';
    }
}