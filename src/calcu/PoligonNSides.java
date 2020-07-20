package calcu;

public class PoligonNSides {

	int numberOfSides;
	double apothem;
	double side;
	
	public PoligonNSides(int numberOfSides, double apothem, double side) {
		this.numberOfSides = numberOfSides;
		this.apothem = apothem;
		this.side = side;
		}

	public double perimeter(int numberOfSides, double side, double apothem) {
		double perimeter = numberOfSides*side;
		return perimeter;
	}
	
	
}
