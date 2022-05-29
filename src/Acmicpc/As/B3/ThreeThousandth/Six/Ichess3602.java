package Acmicpc.As.B3.ThreeThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ichess3602 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int b = Integer.parseInt(tmp.split(" ")[0]);
		int w = Integer.parseInt(tmp.split(" ")[1]);
		int bt = 0, wt = 0, res = 0;
		
		if (w == 0) {
			System.out.println("Impossible");
			return;
		}
		for (int i = 1, t = 0; i < 143; i++) {
			t = (int)Math.pow(i, 2);
			bt = t / 2;
			wt = i % 2 == 0 ? t/2 : t/2+1;
			if (bt <= b && wt <= w) res = i;
			else break;
		}
		System.out.println(res);
		br.close();
	}
}
