package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GodOfSoccer1222 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int t = Integer.parseInt(tmp.split(" ")[0]);
		int c = Integer.parseInt(tmp.split(" ")[1]);
		int s = Integer.parseInt(tmp.split(" ")[2]);
		
		while (t < 90) {
			c++;
			t += 5;
		}
		
		if (c == s) {
			System.out.println("same");
		}
		else if (c > s) {
			System.out.println("win");
		}
		else {
			System.out.println("lose");
		}
	}
}
