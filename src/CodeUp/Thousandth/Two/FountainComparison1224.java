package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FountainComparison1224 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int c = Integer.parseInt(tmp.split(" ")[2]);
		int d = Integer.parseInt(tmp.split(" ")[3]);
		
		double f1 = (double)a / b * 100;
		double f2 = (double)c / d * 100;
		
		if (f1 > f2) {
			System.out.println(">");
		}
		else if (f1 < f2) {
			System.out.println("<");
		}
		else {
			System.out.println("=");
		}
	}
}
