package main;

import city.City;
import company.TransportCompany;
import transport.air.PassengerPlane;
import transport.air.SimplePlane;
import transport.sea.Boat;
import transport.sea.Tanker;
import transport.terrestrial.Bus;
import transport.terrestrial.CargoCar;
import transport.terrestrial.LightCar;

public class Main {
    public static void main(String[] args) {
        //System.out.println("============ Создаем города ====================");
        City city1 = new City("Minsk",true,false);
        City city2 = new City("Vatikan",false,false);
        City city3 = new City("Singapur",false,true);
        City city4 = new City("Sydney",false,true);
        City city5 = new City("Riga",true,false);
        //System.out.println("================================================");
        //System.out.println("============ Создаем транспорт =================");
        PassengerPlane planeBoing = new PassengerPlane("Boing",700,50,1000,2,false,230);
        SimplePlane planeKuku = new SimplePlane("Kukuruznik",150,10,400,1,false);
        Tanker tanker = new Tanker("Tanker Leon", 100,100,3000,4);
        Boat boat = new Boat("Honda30",70,5,50,1);
        LightCar car = new LightCar("Mazda",220,10,400,4);
        CargoCar cargoCar = new CargoCar("DizelTruck",120,30,700,6);
        Bus bus = new Bus("Bus-100",90,20,800,8);
        //System.out.println("================================================");
        System.out.println("======================== Создаем транспортную компанию =============================");
        TransportCompany MyCompany = new TransportCompany("AbudabiLogistic");
        MyCompany.addCity(city1);
        MyCompany.addCity(city2);
        MyCompany.addCity(city3);
        MyCompany.addCity(city4);
        MyCompany.addCity(city5);
        MyCompany.showListCity();
        System.out.println("======================== Создаем транспортную компанию =============================");
        MyCompany.addTransport(planeBoing);
        MyCompany.addTransport(planeKuku);
        MyCompany.addTransport(tanker);
        MyCompany.addTransport(boat);
        MyCompany.addTransport(car);
        MyCompany.addTransport(cargoCar);
        MyCompany.addTransport(bus);



    }
}