package solid.solid_principles.I;

interface TwoDimensionalShape {
	double calculateArea();
}

interface ThreeDimensionalShape {
	double calculateVolume();
}

class Cuboidd implements TwoDimensionalShape, ThreeDimensionalShape {

	@Override
	public double calculateVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}

/*
 * so the problem of square class unnecessarily implementing the volume method
 * is been resolved here by segregatting interfaces according to dimension of
 * shape
 */

class Squaree implements TwoDimensionalShape {

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class ISolution {

}
