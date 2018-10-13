package company;

import city.City;
import transport.Transport;

public class TransportCompany implements ICompany{
    private String nameOfCompany;

    public TransportCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    @Override
    public void addCity(City city) {

    }

    @Override
    public void addTransport(Transport transport) {

    }

    @Override
    public void findTransport(City from, City to, int aPassengers, int aCargo) {

    }
}