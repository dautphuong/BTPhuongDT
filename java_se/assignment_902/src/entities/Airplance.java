package entities;

import java.util.Arrays;

public class Airplance implements Comparable<Airplance>{
    String id;
    String name;
    double runwaySize;
    int maxFixedWingParkingPlace;
    String[] listOfFixedWingAirplaneID;
    int maxRotatedWingParkingPlace;
    String[] listOfHelicopterID;

    public Airplance() {
    }

    public Airplance(String id, String name, double runwaySize,int maxFixedWingParkingPlace, int maxRotatedWingParkingPlace) {
        this.id = id;
        this.name = name;
        this.runwaySize = runwaySize;
        this.maxFixedWingParkingPlace =maxFixedWingParkingPlace;
        this.maxRotatedWingParkingPlace=maxRotatedWingParkingPlace;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRunwaySize() {
        return runwaySize;
    }

    public void setRunwaySize(double runwaySize) {
        this.runwaySize = runwaySize;
    }

    public int getMaxFixedWingParkingPlace() {
        return maxFixedWingParkingPlace;
    }

    public void setMaxFixedWingParkingPlace(int maxFixedWingParkingPlace) {
        this.maxFixedWingParkingPlace = maxFixedWingParkingPlace;
    }

    public String[] getListOfFixedwingAirplaneID() {
        return listOfFixedWingAirplaneID;
    }

    public void setListOfFixedwingAirplaneID(String[] listOfFixedWingAirplaneID) {
        this.listOfFixedWingAirplaneID = listOfFixedWingAirplaneID;
    }

    public int getMaxRotatedWingParkingPlace() {
        return maxRotatedWingParkingPlace;
    }

    public void setMaxRotatedWingParkingPlace(int maxRotatedWingParkingPlace) {
        this.maxRotatedWingParkingPlace = maxRotatedWingParkingPlace;
    }

    public String[] getListOfHelicopterID() {
        return listOfHelicopterID;
    }

    public void setListOfHelicopterID(String[] listOfHelicopterID) {
        this.listOfHelicopterID = listOfHelicopterID;
    }

    @Override
    public int compareTo(Airplance o) {
        return this.getId().compareTo(o.getId());
    }

    @Override
    public String toString() {
        return "Airplance{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", runwaySize=" + runwaySize +
                ", maxFixedWingParkingPlace=" + maxFixedWingParkingPlace +
                ", maxRotatedWingParkingPlace=" + maxRotatedWingParkingPlace +
                '}';
    }
}

