package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwinPrime2607 {
	static int[] check = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		check = new int[b+1];
		for (int i = 0; i < check.length; i++) {
			check[i] = i;
		}
		
		for (int i = 2; i < check.length; i++) {
			if (check[i] == 0) continue;
			for (int j = 2 * i; j < check.length; j+=i) {
				check[j] = 0;
			}
		}
		
		for (int i = a; i <= b; i++) {
			if (!(i-2 >= a && i-2 <= b)) continue;
			if (check[i] != 0 && check[i-2] != 0) {
				System.out.println(i-2 + " " + i);
			}
		}
	}
}
