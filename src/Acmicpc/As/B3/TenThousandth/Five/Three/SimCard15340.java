package Acmicpc.As.B3.TenThousandth.Five.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimCard15340 {
	static final int c = 30;
	static final int d = 40;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int a = 0, b = 0, t = 0, min = 0;
		
		while (true) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			min = Integer.MAX_VALUE;
			if (a == 0 && b == 0) break;
			for (int i = 0; i < 3; i++) {
				t = ((c + (i*5)) * a) + ((d - (i * 10)) * b);
				min = Math.min(t, min);
			}
			sb.append(min + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
