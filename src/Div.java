
public class Div implements Function{
	
	public double perform (double x, double y) throws IllegalArgumentException {
		if (y==0) {
			throw new IllegalArgumentException("Cannot divide by 0");
		}
		return x/y;
	}
	
}
