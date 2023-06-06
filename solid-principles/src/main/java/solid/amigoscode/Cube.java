package solid.amigoscode;

public class Cube implements Shape, ThreeDShape{
	
	@Override
	public double area() {
		return 100;
	}
	
	@Override
	public double volume() {
		return 1000;
	}
	
}
