package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloatMultiple1117 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		float a = Float.parseFloat(tmp.split(" ")[0]);
		float b = Float.parseFloat(tmp.split(" ")[1]);
		
		System.out.printf("%.2f", a * b);
	}
}
