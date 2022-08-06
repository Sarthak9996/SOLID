package solid.solid_principles.L;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
	public void startEngine() {

	}
}

class Car extends Vehicle {
	@Override
	public void startEngine() {

	}
}

class Bicycle extends Vehicle {
	@Override
	public void startEngine() {
//		throw new EngineNotFOundException(s"Engine Missing");
		System.err.println("EngineNotFOundException : Engine Missing for bicycle");
	}
}

public class LIssue {

	public static void startVehicles() {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		Vehicle car = new Car();
		Vehicle cycle = new Bicycle();

		vehicles.add(cycle);
		vehicles.add(car);

		/*
		 * So the problem arises because we will not be able to startEngine in a bicycle
		 */
		vehicles.forEach(vehicle -> vehicle.startEngine());
	}

	public static void main(String[] args) {
		startVehicles();
	}
}