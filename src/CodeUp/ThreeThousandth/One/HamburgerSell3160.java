package CodeUp.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HamburgerSell3160 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] t = new int[121];
		String tmp = null;
		int burger = 0, sell = 0;
		Arrays.fill(t, 0);
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			t[Integer.parseInt(tmp.split(" ")[0])] = Integer.parseInt(tmp.split(" ")[1]);
		}
		
		for (int i = 1; i < t.length; i++) {
			if (i % 10 == 0) burger += 5;
			
			if (t[i] == 0) continue;
			
			if (t[i] <= burger) {
				burger -= t[i];
				sell += t[i];
			}
		}
		
		System.out.println(sell);
	}
}
