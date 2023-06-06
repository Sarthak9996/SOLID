package solid.amigoscode;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {
	
	public int sum(List<Shape> shapes) {
		int sum = 0;
		for(Object shapee : shapes) {
			//			if(shape instanceof Square) {
			//				sum += Math.pow(((Square) shape).getLength(), 2);
			//
			//			}
			//			if(shape instanceof Circle) {
			//				sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
			//
			//			}
			//			by adding multiple if on diff shapes we are violating the Open Closed principle, because everytime we will have to modify the code, rather than extending
			//			so for solution we create a common interface Shape and extend in all shape classes
			//			if(shape instanceof Cube) {
			//			}
			Shape shape = (Shape) shapee;
			sum += shape.area();
		}
		return sum;
	}
	
	//	by doing this we are breaking the single responsibility principle, solution is to move to another class
	//	public String json(List<Object> shapes){
	//		return "{sum : %s}".formatted(sum(shapes));
	//	}
	//
	//	by doing this we are breaking the single responsibility principle, solution is to move to another class
	//	public String csv(List<Object> shapes){
	//		return "sum,%s".formatted(sum(shapes));
	//	}
	
}
