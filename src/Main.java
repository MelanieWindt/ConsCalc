
public class Main {
	public static void main(String [] args) {
		Print pr = new Print ();
		Scan sc = new Scan();
		
		Model ml = new Model (pr, sc);
		ml.run();
		
	}
}
