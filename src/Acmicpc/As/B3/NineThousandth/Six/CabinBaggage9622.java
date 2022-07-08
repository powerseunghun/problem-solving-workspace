package Acmicpc.As.B3.NineThousandth.Six;

import java.io.IOException;
import java.util.Scanner;

public class CabinBaggage9622 {
	static StringBuilder sb = new StringBuilder();
	static int check(double h, double w, double v, double m) {
		if ((h <= 56 && w <= 45 && v <= 25) || (h+w+v) < 125) {
			sb.append(m <= 7 ? 1 : 0);
			sb.append("\n");
			return m <= 7 ? 1 : 0;
		}
		sb.append("0\n");
		return 0;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		double h = 0, w = 0, v = 0, m = 0;
		int t = sc.nextInt(), cnt = 0;
		
		while (t-- > 0) {
			h = sc.nextDouble();
			w = sc.nextDouble();
			v = sc.nextDouble();
			m = sc.nextDouble();
			cnt += check(h, w, v, m);
		}
		
		System.out.print(sb.toString());
		System.out.println(cnt);
	}
}
