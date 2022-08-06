package solid.solid_principles.I;

interface Shape {
	double calculateArea();

	double calculateVolume();
}

class Cuboid implements Shape {

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

}

/*
 * So the problem arises here beacuse we won't be able to calculate volume of a
 * square because its a 2D-shape and for cuboid its fine to calculate both
 * because it is a 3D-shape, calculateVolume() for square is a waste then but it
 * needs to be implemented since it is implementing Shape interface
 */
class Square implements Shape {

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class IIssue {

}
