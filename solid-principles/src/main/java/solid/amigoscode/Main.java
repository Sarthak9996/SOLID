package solid.amigoscode;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		IAreaCalculator areaCalculator = new AreaCalculator();
		Circle circle = new Circle(10);
		Square square = new Square(10);
		Cube cube = new Cube();
		Rectangle rectangle = new Rectangle();
		NoShape noShape = new NoShape();
		List<Shape> shapes = List.of(circle, square, cube, rectangle);
		int sum = areaCalculator.sum(shapes);
		//		System.out.println("sum = " + sum);
		//		System.out.println(areaCalculator.json(shapes));
		ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculator);
		System.out.println(shapesPrinter.json(shapes));
		System.out.println(shapesPrinter.csv(shapes));
	}
	
}
