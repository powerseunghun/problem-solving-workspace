package CodeUp.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsometricSequence1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a1 = Integer.parseInt(tmp.split(" ")[0]);
		int r = Integer.parseInt(tmp.split(" ")[1]) - a1;
		int k = Integer.parseInt(tmp.split(" ")[2]);
		
		for (int i = 0; a1 + r * i <= k; i++) {
			System.out.print((a1+r*i) + " ");
		}
	}
}
