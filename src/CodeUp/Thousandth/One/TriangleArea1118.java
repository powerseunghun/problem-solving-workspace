package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleArea1118 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		double a = Double.parseDouble(tmp.split(" ")[0]);
		double b = Double.parseDouble(tmp.split(" ")[1]);
		
		System.out.printf("%.1f", a * b / 2);
	}
}
