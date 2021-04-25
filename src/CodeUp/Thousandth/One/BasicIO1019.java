package CodeUp.Thousandth.One;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BasicIO1019 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int y = Integer.parseInt(tmp.split("\\.")[0]);
		int m = Integer.parseInt(tmp.split("\\.")[1]);
		int d = Integer.parseInt(tmp.split("\\.")[2]);
		
		System.out.printf("%04d.%02d.%02d", y, m, d);
	}
}
