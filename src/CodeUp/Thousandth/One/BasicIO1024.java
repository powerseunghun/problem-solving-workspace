package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicIO1024 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		
		for (int i = 0; i < tmp.length(); i++) {
			System.out.println("\'" + tmp.charAt(i) + "\'");
		}
	}
}
