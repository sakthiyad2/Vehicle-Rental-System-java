import java.util.Scanner;
 
// Step 1: Vehicle Interface
interface Vehicle {
    void rent();
}
 
// Step 2: Car Class
class Car implements Vehicle {
    public void rent() {
        System.out.println(" Car rented. Comfortable for family trips.");
    }
}
 
// Step 3: Bike Class
class Bike implements Vehicle {
    public void rent() {
        System.out.println("️ Bike rented. Best for quick rides.");
    }
}
 
// Step 4: Truck Class
class Truck implements Vehicle {
    public void rent() {
        System.out.println(" Truck rented. Suitable for goods transport.");
    }
}
 
// Step 5: Factory Class
class VehicleFactory {
 
    public static Vehicle getVehicle(String type) {
 
        if (type == null) {
            return null;
        }
 
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } 
        else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        } 
        else if (type.equalsIgnoreCase("truck")) {
            return new Truck();
        } 
        else {
            return null;
        }
    }
}
 
// Step 6: Main Class
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.println("=================================");
        System.out.println("   🚗 VEHICLE RENTAL SYSTEM");
        System.out.println("=================================");
 
        while (true) {
 
            System.out.println("\nAvailable Vehicles:");
            System.out.println("1. Car");
            System.out.println("2. Bike");
            System.out.println("3. Truck");
            System.out.println("4. Exit");
 
            System.out.print("Enter your choice: ");
            String input = sc.nextLine();
 
            if (input.equals("4")) {
                System.out.println("Thank you for using Vehicle Rental System!");
                break;
            }
 
            Vehicle vehicle = VehicleFactory.getVehicle(input);
 
            if (vehicle != null) {
                vehicle.rent();
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
 
        sc.close();
    }
}
