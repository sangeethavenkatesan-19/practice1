package PracticeExercises;
class Car{//a class called car
	String brand;
	String model;
	int year;
	//constructor for car class
	Car(String brand, String model, int year){
	this.brand=brand;
	this.model=model;
	this.year=year;
	}
	//a new method called display to print the details
	void display() {
		System.out.println("The Car brand is "+brand+". The car model is "+model+". The manufacturing year is "+year+".");
		System.out.println("-----------------------------------------------------------------------------------------------");
	}
}
public class ClassesObjectsConstructors { //a class called classes,objects,constructors
	public static void main(String[] args) {
		// creating objects for the class car
		Car a = new Car("Tata","swift",2009);
		Car b = new Car("Tesla","elicia",2022);
		//printing
		a.display();
		b.display();
	}
}
