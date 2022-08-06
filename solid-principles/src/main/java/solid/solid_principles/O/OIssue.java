package solid.solid_principles.O;

public class OIssue {
	public double calculate(double a1, double a2, String operationType) {
		switch (operationType) {
		case "+":
			return a1 + a1; // Addition operation
		case "-":
			return a1 - a1; // Subtraction operation

		/*
		 * So the problem arises when we want to add more operation, everytime we will
		 * be required to modify our existing code which may invite any new bug in our
		 * working project
		 */
		case "/":
			return a1 / a2;

		case "%":
			return a1 % a2;
		default:
			break;
		}

		return 0;
	}
}
