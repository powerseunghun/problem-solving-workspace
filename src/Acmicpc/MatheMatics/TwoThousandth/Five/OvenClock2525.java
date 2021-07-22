package Acmicpc.MatheMatics.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OvenClock2525 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int h = 0, m = 0, t = 0;
		String tmp = br.readLine();
		h = Integer.parseInt(tmp.split(" ")[0]);
		m = Integer.parseInt(tmp.split(" ")[1]);
		t = Integer.parseInt(br.readLine());
		
		m += t;
		if (m >= 60) {
			h += m / 60;
			m = m % 60;
		}
		
		if (h >= 24) {
			h %= 24;
		}
		System.out.println(h + " " + m);
	}
}
