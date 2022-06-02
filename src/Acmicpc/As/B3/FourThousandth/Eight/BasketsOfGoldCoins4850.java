package Acmicpc.As.B3.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasketsOfGoldCoins4850 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		long N = 0, w = 0, d = 0, sum = 0, res = 0;
		
		while ((str = br.readLine()) != null) {
			N = Long.parseLong(str.split(" ")[0]);
			w = Long.parseLong(str.split(" ")[1]);
			d = Long.parseLong(str.split(" ")[2]);
			sum = Long.parseLong(str.split(" ")[3]);
			res = ((N * (N-1) / 2 * w) - sum) / d;
			
			sb.append(res + "\n");
		}
		 System.out.print(sb.toString());
	}
}
