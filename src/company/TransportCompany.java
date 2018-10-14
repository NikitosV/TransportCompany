package company;

import city.City;
import transport.Air;
import transport.Transport;

import java.util.ArrayList;
import java.util.List;

public class TransportCompany implements ICompany{
    private String nameOfCompany;
    private List<City> arrayCity;
    private List<Transport> arrayTransport;

    public TransportCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
        this.arrayCity = new ArrayList<>();
        this.arrayTransport = new ArrayList<>();
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    @Override
    public void addCity(City city) {
        arrayCity.add(city);
    }

    @Override
    public void addTransport(Transport transport) {
        arrayTransport.add(transport);
    }

    @Override
    public void showListCity() {
        if(arrayCity.isEmpty()){
            System.out.println("Список пуст!");
        }
        else {
            for (City anArrayCity : arrayCity) {
                System.out.println(anArrayCity);
            }
        }
    }

    @Override
    public void showListTransport() {
        if(arrayTransport.isEmpty()){
            System.out.println("Список пуст!");
        }
        else {
            for(int i = 0; i < arrayTransport.size(); i++){
                System.out.println(arrayTransport.get(i));
            }
        }
    }

    //TODO make search to Transport
    @Override
    public void findTransport(City from, City to, int aPassengers, int aCargo) {
        for(int i = 0; i < arrayTransport.size(); i++){
            if(from.isHasAirport() == true && to.isHasAirport() == true){
                System.out.println(arrayTransport.get(i));
                break;
            }
            else {
                if(from.isHasSeaport() == true && to.isHasSeaport() == true){
                    System.out.println(arrayTransport.get(i));
                    break;
                }
                else {
                    System.out.println(arrayTransport.get(i));
                }
            }
        }
    }
}