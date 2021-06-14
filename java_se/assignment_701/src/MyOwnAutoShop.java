public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan=new Sedan(100,200.0,"red",25);
        Ford ford = new Ford(120,250,"blue",1988,50);
        Ford ford1 = new Ford(120,220,"blue",1990,50);
        Truck truck=new Truck(110,220,"red",2200);
        Truck truck2=new Truck(110,250,"red",1900);

        System.out.println(sedan.toString());
        System.out.println(ford.toString());
        System.out.println(ford1.toString());
        System.out.println(truck.toString());
        System.out.println(truck2.toString());
    }
}
