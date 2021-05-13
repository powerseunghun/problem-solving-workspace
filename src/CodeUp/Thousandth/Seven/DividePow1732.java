package CodeUp.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DividePow1732 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		System.out.printf("%.1f\n", (double)a / b);
		System.out.println(a / b);
		System.out.println((int)Math.pow(a, b));
	}
}
