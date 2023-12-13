package geometricDimensions;
public class Square extends GeometricShape {
	private double side;
	public Square(double side) {
		this.side=side;
	}
	public void displayArea() {
		double area =side * side;
		System.out.println("The Area of Square is "+area);
	}
}
