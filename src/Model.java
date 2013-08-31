import java.io.IOException;
import java.util.HashMap;

public class Model {
	private HashMap<String, Function> operations = new HashMap<>();
	private Print pr;
	private Scan sc;

	public Model(Print pr, Scan sc) {
		this.pr = pr;
		this.sc = sc;
		operations.put("+", new Add());
		operations.put("-", new Sub());
		operations.put("*", new Mult());
		operations.put("/", new Div());
	}

	public void run() {
		try {
			pr.print("Enter the first number");
			String s1 = sc.scan();
			pr.print("Enter the operation");
			String op = sc.scan();
			pr.print("Enter the second number");
			String s2 = sc.scan();

			// convert, now we have operation op, ad two double num1 and num2;
			double num1 = Double.parseDouble(s1);
			double num2 = Double.parseDouble(s2);
			double result = perform(num1, num2, op);
			pr.print("Result = " + result);
		} catch (NumberFormatException e) {
			pr.print("Invalid number format");
		} catch (IOException e) {
			pr.print("Input error");
		} catch (IllegalArgumentException e) {
			pr.print(e.getMessage());
		}
	}

	public double perform(double num1, double num2, String str)
			throws IllegalArgumentException {
		Function interf = operations.get(str);
		if (interf == null) {
			throw new IllegalArgumentException("No such operation");
		}
		double result = interf.perform(num1, num2);
		return result;
	}
}
