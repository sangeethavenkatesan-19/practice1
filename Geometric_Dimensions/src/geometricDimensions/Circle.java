package geometricDimensions;
public class Circle extends GeometricShape{
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public void displayArea() {
		double area = 3.14 * radius * radius;
		System.out.println("The Area of Circle is "+area);
	}
}
