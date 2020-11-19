import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*  project includes:
    - my own interface Additionable and its implementation in Vehicle class
    - overridden methods: toString(), hashCode(), equals():
        - comparison of different objects using hashCode() and equals()
    - implementation of Comparable interface - overridden method compareTo();
        - sorting by maximum speed parameter
    - implementation of Cloneable interface - overridden method clone():
       - shallow cloning/copying
       - deep cloning/copying


 */


public class MainVehicle  {
    public static void main(String[] args) {


        Car car = new Car("WA23231", 190, 5);
        Car car1 = new Car("WA23231", 180, 4);
        Car car2 = new Car("WA23231", 192, 2);

        List<Car> carList = new ArrayList<>(List.of(car, car1, car2));
        Collections.sort(carList);
        System.out.println(carList);

        car.setAdditionalEquipment(new ArrayList<>(List.of("simple CAR brakes", "extreme lights")));



//        System.out.println(car.equals(car1));
//
//        System.out.println(car.hashCode());
//        System.out.println(car1.hashCode());
//
//        System.out.println(car.hashCode() == car1.hashCode());


        Vehicle vehicle = new Vehicle("WT209098", 295);

//        System.out.println(vehicle.toString());
//        System.out.println(car.toString());
//        Vehicle vehicle1 = new Vehicle("WT209098", 180);
//        Vehicle vehicle2 = new Vehicle("WT209098", 250);


        // prepared list of Vehicles to present sorting using Comparable interface
//        List<Vehicle> vehicleList = new ArrayList<>(List.of(vehicle, vehicle1, vehicle2));
//        Collections.sort(vehicleList);
//        System.out.println(vehicleList);

        try {

            Vehicle vehicleCloned = vehicle.clone();
//            System.out.println("Original vehicle:" + vehicle);
//            System.out.println("AFTER CLONING");
//            System.out.println("Cloned vehicle:" + vehicleCloned);
//            System.out.println("Original vehicle hashCode:\t" + vehicle.hashCode());

            vehicleCloned.setRegistrationDate(2000, 12, 1);
//            vehicleCloned.setAdditionalEquipment(new ArrayList<>(List.of("a", "b")));
//
//            System.out.println("Original vehicle:" + vehicle);
//            System.out.println("Cloned vehicle:" + vehicleCloned);
//            vehicle.setAdditionalEquipment(new ArrayList<>(List.of("super effective VEHICLE brakes", "halogen lights")));
//            System.out.println("Cloned vehicle hashCode:\t" + vehicleCloned.hashCode());
//            System.out.println("Equals method: " + vehicle.equals(vehicleCloned));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}