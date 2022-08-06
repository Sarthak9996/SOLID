package solid.solid_principles.L;

import java.util.ArrayList;
import java.util.List;

class Vehiclee {
	public void startEngine() {

	}
}

class VehicleWithEngine extends Vehiclee {
	public void startEngine() {

	}
}

class VehicleWithoutEngine extends Vehiclee {
	public void moveVehicle() {

	}
}

class Carr extends VehicleWithEngine {
	@Override
	public void startEngine() {
		System.err.println("Car engine started");
	}
}

class Bicyclee extends VehicleWithoutEngine {
	@Override
	public void moveVehicle() {
		System.err.println("Bicycle is moving");
	}
}

public class LSolution {

	public static void startVehicles() {
		List<Vehiclee> vehicles = new ArrayList<Vehiclee>();
		Vehiclee car = new Carr();
		Vehiclee cycle = new Bicyclee();

		vehicles.add(cycle);
		vehicles.add(car);

		/*
		 * So the problem is solved because we futher broke the parent child relation in
		 * one more step
		 */
		vehicles.forEach(vehicle -> vehicle.startEngine());
	}

	public static void main(String[] args) {
		startVehicles();
	}

}
