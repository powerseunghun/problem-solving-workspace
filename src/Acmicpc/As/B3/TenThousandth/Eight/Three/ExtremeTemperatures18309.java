package Acmicpc.As.B3.TenThousandth.Eight.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExtremeTemperatures18309 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int v = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		while ((str = br.readLine()) != null) {
			for (int i = 1; i < str.split(" ").length; i++) {
				v = Integer.parseInt(str.split(" ")[i]);
				max = Math.max(max, v);
				min = Math.min(min, v);
			}
		}
		System.out.println(min + " " + max);
		br.close();
	}
}
