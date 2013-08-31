import java.io.IOException;
import java.util.HashMap;

public class Model {
	
	HashMap<String, function> operations = new HashMap<>();
	
	public Model () {
		operations.put("+", new Add ());
		operations.put ("-", new Sub ());
		operations.put ("*", new Mult ());
		operations.put("/", new Div());
	}
	
	public double perform (String str, double num1, double num2) {
		double result = 0; 
		try {
			result = operations.get(str).perform (num1, num2);
		} catch (IOException e) {
			Print pr = new Print();
			pr.print(e);
			e.printStackTrace();
		}
		return result;
	} 
}
