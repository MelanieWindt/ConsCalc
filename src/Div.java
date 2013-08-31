import java.io.IOException;


public class Div implements function{
	
	public double perform (double x, double y) throws IOException {
		if (y==0) {
			Print pr = new Print();
			pr.print("Cannot divide by 0");
			throw new IOException ();
		}
		return x/y;
	}
	
}
