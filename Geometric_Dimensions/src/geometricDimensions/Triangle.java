package geometricDimensions;
public class Triangle extends GeometricShape {
	private double height,base;
	public Triangle(double height,double base) {
		this.height=height;
		this.base=base;
	}
	public void displayArea() {
		double area =0.5 * height * base;
		System.out.println("The Area of Triangle is "+area);
	}
}
