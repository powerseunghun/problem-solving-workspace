package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorization2034 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int b = Integer.parseInt(tmp.split(" ")[0]);
		int c = Integer.parseInt(tmp.split(" ")[1]), x = 0;
		int D = (b * b) - (4 * 1 * c);
		
		if (D > 0) {
			x = (int) ((-1 * b) + Math.sqrt(D));
			if (x < 0) System.out.println("x+" + ((x/2) * -1));
			else System.out.println("x" + ((x/2) * -1));
			x = (int) ((-1 * b) - Math.sqrt(D));
			if (x < 0) System.out.println("x+" + ((x/2) * -1));
			else System.out.println("x" + ((x/2) * -1));
		}
		else if (D == 0) {
			x = (int) ((-1 * b) + Math.sqrt(D));
			if (x < 0) System.out.println("x+" + ((x/2) * -1));
			else System.out.println("x" + ((x/2) * -1));
		}
		else {
			System.out.println(-1);
		}
	}
}
