package CodeUp.Thousandth.One;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BasicIO1014 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.printf("%.2f", Float.parseFloat(br.readLine()));
	}
}
