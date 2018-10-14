package main;

import city.City;
import company.TransportCompany;
import transport.PassengerPlane;
import transport.SimplePlane;
import transport.Boat;
import transport.Tanker;
import transport.Bus;
import transport.CargoCar;
import transport.LightCar;

public class Main {
    public static void main(String[] args) {
        City city1 = new City("Minsk",true,false);
        City city2 = new City("Vatikan",false,false);
        City city3 = new City("Singapur",false,true);
        City city4 = new City("Sydney",false,true);
        City city5 = new City("Riga",true,false);

        PassengerPlane planeBoing = new PassengerPlane("Boing",700,50,1000, true,false,2,false,230);
        SimplePlane planeKuku = new SimplePlane("Kukuruznik",150,10,400,true,false, 1,false);
        Tanker tanker = new Tanker("Tanker Leon", 100,100,3000,false, true,4,800);
        Boat boat = new Boat("Honda30",70,5,50,false,true,1);
        LightCar car = new LightCar("Mazda",220,10,400,false,false,4);
        CargoCar cargoCar = new CargoCar("DizelTruck",120,30,700,false, false,8,400);
        Bus bus = new Bus("Bus100",90,20,800,false,false,6,128);

        System.out.println("======================== Создаем транспортную компанию =============================");
        TransportCompany MyCompany = new TransportCompany("AbudabiLogistic");
        MyCompany.addCity(city1);
        MyCompany.addCity(city2);
        MyCompany.addCity(city3);
        MyCompany.addCity(city4);
        MyCompany.addCity(city5);
        System.out.println("Список городов:");
        MyCompany.showListCity();

        MyCompany.addTransport(planeBoing);
        MyCompany.addTransport(planeKuku);
        MyCompany.addTransport(tanker);
        MyCompany.addTransport(boat);
        MyCompany.addTransport(car);
        MyCompany.addTransport(cargoCar);
        MyCompany.addTransport(bus);
        System.out.println("Список транспортов:");
        MyCompany.showListTransport();
        System.out.println("====================================================================================");
        MyCompany.findTransport(city1,city5,100,50);
        System.out.println();
        MyCompany.findTransport(city3,city4,100,50);
    }
}