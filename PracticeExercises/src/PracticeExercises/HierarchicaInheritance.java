package PracticeExercises;
//Parent class (superclass)
class Vehicle {
 void drive() {
     System.out.println("The vehicle is being driven.");
 }
}
//Child class 1 extending the Vehicle class
class Car1 extends Vehicle {
 void accelerate() {
     System.out.println("The car is accelerating.");
 }
}
//Child class 2 extending the Vehicle class
class Bike extends Vehicle {
 void startPedaling() {
     System.out.println("The bike is being pedaled.");
 }
}
public class HierarchicaInheritance {
	public static void main(String[] args) {
		// Creating objects of the Car and Bike classes
        Car1 myCar = new Car1();
        Bike myBike = new Bike();

        // Accessing methods from the Vehicle, Car, and Bike classes
        myCar.drive(); // Method from the Vehicle class
        myCar.accelerate(); // Method from the Car class

        myBike.drive(); // Method from the Vehicle class
        myBike.startPedaling(); // Method from the Bike class
    }
}
