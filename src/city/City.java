package city;

public class City{
    private String nameOfCity;
    private boolean isHasAirport;
    private boolean isHasSeaport;

    public City(String nameOfCity, boolean isHasAirport, boolean isHasSeaport) {
        this.nameOfCity = nameOfCity;
        this.isHasAirport = isHasAirport;
        this.isHasSeaport = isHasSeaport;
    }

    public String getNameOfCity() {
        return nameOfCity;
    }

    public void setNameOfCity(String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }

    public boolean isHasAirport() {
        return isHasAirport;
    }

    public void setHasAirport(boolean hasAirport) {
        isHasAirport = hasAirport;
    }

    public boolean isHasSeaport() {
        return isHasSeaport;
    }

    public void setHasSeaport(boolean hasSeaport) {
        isHasSeaport = hasSeaport;
    }

    @Override
    public String toString() {
        return "Город{" +
                "Название города='" + nameOfCity + '\'' +
                ", Наличие аэрапорта=" + isHasAirport +
                ", Наличие морского порта=" + isHasSeaport +
                '}';
    }
}