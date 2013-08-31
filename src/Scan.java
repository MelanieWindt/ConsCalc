import java.io.*;


public class Scan {
	public String scan () {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String s=null;
		try {
			s = br.readLine();
		} catch (IOException e) {
			Print pr = new Print();
			pr.print(e);
		}
		return s;
	} 
}
