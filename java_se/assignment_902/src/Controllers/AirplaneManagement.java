package Controllers;

import entities.Airplance;

import java.util.Scanner;

import static Controllers.MainManagement.displayMainMenu;
import static services.AirplaneService.*;
import static Controllers.MainManagement.listAirplane;;

public class AirplaneManagement {
    static void airportManagement(){
        System.out.println("------------------------------------------------");
        System.out.println("Airport menu :");
        System.out.println("1.Display list of all airport information\n" +
                "2.Display the status of one airport\n" +
                "3.Back to menu\n" +
                "4.Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choose: ");
        String choose = scanner.next();
        switch (choose) {
            case "1":
                findAll();
                airportManagement();
            case "2":
            	System.out.print("Input id Airport :");
            	scanner.nextLine();
            	String id= scanner.nextLine();
            	for (Airplance airplance : listAirplane) {
					if(id.equals(airplance.getId())){
						displayAirportMenu(airplance);
						break;
					}
				}
                airportManagement();
            case "3":
                displayMainMenu();
                break;
            case "4":
                System.exit(0);
                break;
            default:
                System.out.println("Fail! Please choose again!");
                airportManagement();
        }
    }

    public static void displayAirportMenu(Airplance airplance){
    	System.out.println("------------------------------------------------");
    	System.out.println(airplance.toString());
        System.out.println("Airport menu :");
        System.out.println("1.Add new Fixed Wing\n" +
                "2.Remove Fixed Wing\n" +
                "3.Back to menu\n" +
                "4.Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choose: ");
        String choose = scanner.next();
        switch (choose) {
            case "1":
            	addFixedWingAirplane(airplance);
            	break;
            case "2":
            	
            case "3":
            	airportManagement();
                break;
            case "4":
                System.exit(0);
                break;
            default:
                System.out.println("Fail! Please choose again!");
                airportManagement();
        }
    }
}
