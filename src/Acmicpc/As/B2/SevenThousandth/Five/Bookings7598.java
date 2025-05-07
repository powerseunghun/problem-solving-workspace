package Acmicpc.As.B2.SevenThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bookings7598 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null, s = null;
		int n = 0, X = 0;
		
		while(true) {
			str = br.readLine();
			n = Integer.parseInt(str.split(" ")[1]);
			s = str.split(" ")[0];
			if (s.equals("#") && n == 0) break;;
			
			while (true) {
				str = br.readLine();
				X = Integer.parseInt(str.split(" ")[1]);
				str = str.split(" ")[0];
				
				if (str.equals("X")) break;
				
				if (str.equals("B")) {
					n += (n+X <= 68 ? 1 : 0) * X;
				} else if (str.equals("C")) {
					n -= (n-X >= 0 ? 1 : 0) * X;
				}
			}
			sb.append(s).append(" ").append(n).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
