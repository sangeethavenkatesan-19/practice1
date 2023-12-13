package PracticeExercises;
//First interface
interface Vehicle12 {
	void drive();
}
//Second interface
interface Gadget {
	void useGadget();
}
//Class implementing both interfaces (multiple inheritance through interfaces)
class Car13 implements Vehicle12, Gadget {
	//@Override
	public void drive() {
		System.out.println("The car is being driven.");
	}

	//@Override
	public void useGadget() {
		System.out.println("The car's gadget is being used.");
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		// Creating an object of the Car class
        Car13 myCar = new Car13();

        // Accessing methods from both interfaces
        myCar.drive(); // Method from the Vehicle interface
        myCar.useGadget(); // Method from the Gadget interface
    }
}