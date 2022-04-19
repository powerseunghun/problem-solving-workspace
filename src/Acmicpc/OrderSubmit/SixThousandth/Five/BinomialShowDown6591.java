package Acmicpc.OrderSubmit.SixThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinomialShowDown6591 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int n = 0, k = 0;
		long res = 0;
		
		while (true) {
			tmp = br.readLine();
			n = Integer.parseInt(tmp.split(" ")[0]);
			k = Integer.parseInt(tmp.split(" ")[1]);
			if (n == 0 && k == 0) break;
			res = 1;
			
			int lv = Math.min(k, n-k);
			for (int i = 1; i <= lv; i++) {
				res *= n;
				res /= i;
				n--;
			}
			sb.append(res + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
