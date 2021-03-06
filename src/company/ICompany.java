package company;

import city.City;
import transport.Transport;

import java.util.ArrayList;

public interface ICompany {
    void addCity(City city);
    void addTransport(Transport transport);
    void showListCity();
    void showListTransport();
    void findTransport(City from, City to, int aPassengers, int aCargo);
}