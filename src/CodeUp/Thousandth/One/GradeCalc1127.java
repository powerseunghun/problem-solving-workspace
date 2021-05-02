package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GradeCalc1127 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double sum = 0;
		String tmp = null;
		
		for (int i = 0; i < 3; i++) {
			tmp = br.readLine();
			sum += (Double.parseDouble(tmp.split(" ")[0]) * Integer.parseInt(tmp.split(" ")[1]));
		}
		
		System.out.printf("%.1f", sum);
	}
}
