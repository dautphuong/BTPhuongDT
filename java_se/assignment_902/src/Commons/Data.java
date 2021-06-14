package Commons;

import entities.Airplance;

import static Controllers.MainManagement.listAirplane;

public class Data {
    public static void dataDefault(){
        listAirplane.add(new Airplance("AP00001","Name A",100.0,3,3));
        listAirplane.add(new Airplance("AP00003","Name C",200.0,4,2));
        listAirplane.add(new Airplance("AP00002","Name B",150.0,4,5));
    }
}
