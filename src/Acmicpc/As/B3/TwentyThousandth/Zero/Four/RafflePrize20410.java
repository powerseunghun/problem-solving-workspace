package Acmicpc.As.B3.TwentyThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RafflePrize20410 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int m = Integer.parseInt(tmp.split(" ")[0]);
		int seed = Integer.parseInt(tmp.split(" ")[1]);
		int x1 = Integer.parseInt(tmp.split(" ")[2]);
		int x2 = Integer.parseInt(tmp.split(" ")[3]), res1 = 0, res2 = 0;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if ((i*seed+j) % m == x1) {
					if ((i*x1+j) % m == x2) {
						res1 = i;
						res2 = j;
						break;
					}
				}
			}
		}
		
		System.out.println(res1 + " " + res2);
		br.close();
	}
}
