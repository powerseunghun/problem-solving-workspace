package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IterationPrint1255 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		double s = Double.parseDouble(tmp.split(" ")[0]);
		double e = Double.parseDouble(tmp.split(" ")[1]);
		
		for (double i = s; i <= e; i += 0.01) {
			System.out.printf("%.2f ", i);
		}
	}
}
