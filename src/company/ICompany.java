package company;

import city.City;
import transport.Transport;

public interface ICompany {
    void addCity(City city);
    void addTransport(Transport transport);
    void findTransport(City from, City to, int aPassengers, int aCargo);
}