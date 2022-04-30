package Acmicpc.As.B4.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AIClock2530 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int h = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		int s = Integer.parseInt(tmp.split(" ")[2]);
		int d = Integer.parseInt(br.readLine());
		
		s += d % 60;
		if (s >= 60) {
			m += (s / 60);
			s %= 60;
		}
		
		m += d / 60;
		if (m >= 60) {
			h += (m / 60);
			m %= 60;
		}
		if (h >= 24) {
			h %= 24;
		}
		
		System.out.println(h + " " + m + " " + s);
		br.close();
	}
}
