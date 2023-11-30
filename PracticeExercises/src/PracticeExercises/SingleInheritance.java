package PracticeExercises;
//Parent class (superclass)
class Vehicle1 {
	void drive() {
		System.out.println("The vehicle is being driven.");
	}
}
//Child class (subclass) extending the Vehicle class
class bike1 extends Vehicle1 {
	void accelerate() {
		System.out.println("The bike is accelerating.");
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		// Creating an object of the Car class
        bike1 a = new bike1();

        // Accessing methods from both Vehicle and Car classes
        a.drive(); // Method from the Vehicle class
        a.accelerate(); // Method from the Car class
	}
}
