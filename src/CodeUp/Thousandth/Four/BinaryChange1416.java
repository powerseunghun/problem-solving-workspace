package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryChange1416 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		if (n == 0) sb.append(0);
		
		while (n != 0) {
			sb.append(n%2);
			n/=2;
		}
		
		System.out.println(sb.reverse());
	}
}
