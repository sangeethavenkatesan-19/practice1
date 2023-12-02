package geometricDimensions;

public class Rectangle extends GeometricShape {
	private double length,width;
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	public void displayArea() {
		double area =length * width;
		System.out.println("The Area of Rectangle is "+area);
	}
}
