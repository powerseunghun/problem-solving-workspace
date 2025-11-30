package Acmicpc.As.B2.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasketsOfGoldCoins4850 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int n = 0, w = 0, d = 0, r = 0, res = 0;
		
		while((str = br.readLine()) != null) {
			n = Integer.parseInt(str.split(" ")[0]);
			w = Integer.parseInt(str.split(" ")[1]);
			d = Integer.parseInt(str.split(" ")[2]);
			r = Integer.parseInt(str.split(" ")[3]);
			res = ((n-1)*n / 2*w-r) / d;
			sb.append(res != 0 ? res : n).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
