package Acmicpc.As.B4.TenThousandth.Eight.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheNearestValue18414 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int X = Integer.parseInt(tmp.split(" ")[0]);
		int L = Integer.parseInt(tmp.split(" ")[1]);
		int R = Integer.parseInt(tmp.split(" ")[2]);
		int res = 0, diff = Integer.MAX_VALUE;
		
		for (int i = L; i <= R; i++) {
			if (Math.abs(i-X) < diff) {
				diff = Math.abs(i-X);
				res = i;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
