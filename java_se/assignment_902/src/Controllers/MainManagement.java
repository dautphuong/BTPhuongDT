package Controllers;

import entities.Airplance;
import entities.FixedWing;
import entities.Helicopter;

import java.util.ArrayList;
import java.util.Scanner;

import static Commons.Data.dataDefault;
import static Controllers.AirplaneManagement.airportManagement;
import static Controllers.FixedWingManagement.fixedWingAirplaneManagement;
import static Controllers.HelicopterManagement.helicopterAirplaneManagement;

public class MainManagement {

    public static ArrayList<Airplance> listAirplane = new ArrayList<>();
    public static ArrayList<FixedWing> listFixedWing = new ArrayList<>();
    public static ArrayList<Helicopter> listHelicopter = new ArrayList<>();


    public static void main(String[] args) {
        dataDefault();
        displayMainMenu();
    }

    static void displayMainMenu() {
        System.out.println("------------------------------------------------");
        System.out.println("Main menu :");
        System.out.println("1. Airport management\n"+
                "2. Fixed wing airplane management\n"+
                "3. Hentities.Helicopter management group\n"+
                "4.Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choose: ");
        String choose = scanner.next();
        switch (choose) {
            case "1":
                airportManagement();
                displayMainMenu();
            case "2":
                fixedWingAirplaneManagement();
                displayMainMenu();
            case "3":
                helicopterAirplaneManagement();
                displayMainMenu();
            case "4":
                System.exit(0);
                break;
            default:
                System.out.println("Fail! Please choose again!");
                displayMainMenu();
        }
    }





}
