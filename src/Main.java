
public class Main {
	public static void main(String [] args) {
		double result;
		//readLine
		System.out.println("Enter the first number");
		Scan sc = new Scan ();
		String s1 = sc.scan();
		System.out.println("Enter the operation");
		String op = sc.scan();
		System.out.println("Enter the second number");
		String s2 = sc.scan();
		
		//convert, now we have operation op, ad two double num1 and num2;
		double num1 = Double.parseDouble(s1);
		double num2 = Double.parseDouble(s2);
		
		Model ml = new Model ();
		result = ml.perform(op, num1, num2);
		Print pr = new Print ();
		pr.print("Result = "+ result);
		
	}
}
