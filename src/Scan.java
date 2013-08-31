import java.io.*;


public class Scan {
	private BufferedReader br;
	public Scan () {
		this.br = new BufferedReader (new InputStreamReader(System.in));
	}
	
	public String scan () throws IOException{
		return br.readLine();		
	} 
}
