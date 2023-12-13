package geometricDimensions;
import java.util.*;
public class CalculatedArea {
	public static void main(String[] args) {
		ArrayList<GeometricShape > shapesList = new ArrayList<>();

        try {
            // Creating objects for classes
            Circle circle = new Circle(5);
            Rectangle rectangle = new Rectangle(4,6);
            Triangle triangle = new Triangle(3,5);
            Square square = new Square(5);
            
            // Adding objects to the shapesList
            shapesList.add(circle);
            shapesList.add(rectangle);
            shapesList.add(triangle);
            shapesList.add(square);

            // Calculating areas and displaying using loop
            for (GeometricShape shape : shapesList) {
                shape.displayArea(); // Displaying area (overridden in child classes)
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Perform cleanup if needed
        }
    }
}