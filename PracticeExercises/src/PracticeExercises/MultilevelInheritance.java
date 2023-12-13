package PracticeExercises;
//Parent class (superclass)
class Vehicles1 {
 void drive() {
     System.out.println("The vehicle is being driven.");
 }
}
//Child class extending the Vehicle class
class Truck extends Vehicles1 {
 void accelerate() {
     System.out.println("The Truck is accelerating.");
 }
}
//Subclass extending the Car class
class LargeTruck extends Truck {
 void turboCharge() {
     System.out.println("The large Truck is turbocharged!");
 }
}
public class MultilevelInheritance {
	public static void main(String[] args) {
		// Creating an object of the SportsCar class
        LargeTruck a = new LargeTruck();

        // Accessing methods from all three classes
        a.drive(); // Method from the Vehicle class
        a.accelerate(); // Method from the Car class
        a.turboCharge(); // Method from the SportsCar class
    }
}