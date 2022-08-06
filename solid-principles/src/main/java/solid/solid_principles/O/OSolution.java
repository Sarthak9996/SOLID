package solid.solid_principles.O;

interface Operation {
	public double calculate(double a1, double a2);
}

class Addition implements Operation {

	@Override
	public double calculate(double a1, double a2) {
		return a1 + a2;
	}

}

class Subtraction implements Operation {

	@Override
	public double calculate(double a1, double a2) {
		return a1 - a2;
	}

}

/*
 * So here the problem of not following open for extension and closed for
 * modification rule is solved by creating an interface and we can create n
 * number of operations withour modifying existing code
 */

class Division implements Operation {

	@Override
	public double calculate(double a1, double a2) {
		return a1 / a2;
	}

}

class Modulo implements Operation {

	@Override
	public double calculate(double a1, double a2) {
		return a1 % a2;
	}

}

public class OSolution {

}
