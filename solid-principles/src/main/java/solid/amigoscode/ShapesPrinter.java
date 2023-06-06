package solid.amigoscode;

import java.util.List;

public class ShapesPrinter {
	
	private final IAreaCalculator iareaCalculator;
	
	public ShapesPrinter(IAreaCalculator areaCalculator) {
		this.iareaCalculator=areaCalculator;
	}
	
	public String json(List<Shape> shapes){
		return "{shapesSum : %s}".formatted(iareaCalculator.sum(shapes));
	}
	
	public String csv(List<Shape> shapes){
		return "shapes_Sum,%s".formatted(iareaCalculator.sum(shapes));
	}
}
