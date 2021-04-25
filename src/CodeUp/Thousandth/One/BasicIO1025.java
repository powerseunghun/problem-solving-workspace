package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicIO1025 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		
		for (int i = 0; i < tmp.length(); i++) {
			System.out.print("[" + tmp.charAt(i));
			for (int j = i; j < tmp.length()-1; j++) {
				System.out.print("0");
			}
			System.out.println("]");
		}
	}
}
