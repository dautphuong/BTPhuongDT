package services;

import entities.Airplance;
import entities.FixedWing;

import java.util.*;

import static Commons.AirplaneException.idException;
import static Controllers.MainManagement.listAirplane;
import static Controllers.MainManagement.listFixedWing;

public class AirplaneService {
    static Scanner scanner = new Scanner(System.in);

    public static Airplance createAirplane()  {
        Airplance airplance = new Airplance();
        while (true) {
            try {
                System.out.print("Enter id airplane :");
                airplance.setId(scanner.nextLine());
                idException(airplance.getId());
                break;
            } catch (Exception e) {
                System.out.println("Id started by 'AP' , followed by 5 digits");
            }
        }
        System.out.print("Enter name airplane :");
        airplance.setName(scanner.nextLine());
        System.out.print("Enter runway Size :");
        airplance.setRunwaySize(Double.parseDouble(scanner.nextLine()));
        System.out.print("Enter max Fixed-wing Parking Place :");
        airplance.setMaxFixedWingParkingPlace(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter max Rotated-wing Parking Place :");
        airplance.setMaxRotatedWingParkingPlace(Integer.parseInt(scanner.nextLine()));

        return airplance;
    }

    public static void addFixedWingAirplane(Airplance airplance){
        System.out.println("----------List fixed-wing not have airplane-----------");
        Set<String> arrPrints = null;
        for(int i=0;i<listAirplane.size();i++) {
            for (FixedWing fixedWing : listFixedWing) {
                if(!Arrays.stream(listAirplane.get(i).getListOfFixedwingAirplaneID()).anyMatch(fixedWing.getIdFixed()::equals))
                arrPrints.add( fixedWing.getIdFixed());
            }
        }
        try {
            for(String arrPrint : arrPrints) {
                System.out.println(arrPrint);
            }
            scanner.nextLine();
        }catch (Exception e){
            System.out.println("List customer is null");
        }
        
        
        System.out.print("Enter id fixed wing add airplane :");
        String idFixed=scanner.nextLine();
        for (FixedWing fixedWing: listFixedWing) {
            if(idFixed.contains(fixedWing.getIdFixed())){
                ArrayList<String> fixedWings= new ArrayList<>();
                Collections.addAll(fixedWings,airplance.getListOfFixedwingAirplaneID());
                fixedWings.add(fixedWing.getIdFixed());
                airplance.setListOfFixedwingAirplaneID((String[]) fixedWings.toArray());
            }
        }
    }

    public static void removeFixedWingAirplane(Airplance airplance){
        
    }

    public static void findAll(){
        System.out.println("----------List airplance-----------");
        for (int i=0;i<listAirplane.size();i++) {
            System.out.println(i+". "+listAirplane.get(i).toString());
        }
        scanner.nextLine();
    }

}
