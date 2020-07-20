package calcu;

public class Triangle {
	
	private double base;
	private double hei;
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(double base, double hei) {
		this.base = base;
		this.hei = hei;
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double calculatePerimeter1(double side1,double side2,double side3) {
		double perimeter = side1+side2+side3;
		return perimeter;
	}
	
	public double calculatePerimeter2(double side,double base,double hei) {
		double perimeter = side+base+hei;
		return perimeter;
	}
	
	public double calculateArea1(double base, double hei) {
		double area = (base*hei)/2;
		return area;
	}
	
	public double calculateArea2(double side1, double side2, double side3) {
		double sum = (side1+side2+side3)/2;
		double area = Math.sqrt(sum*(sum-side1)*(sum-side2)*(sum-side3));
		return area;
	}
}
