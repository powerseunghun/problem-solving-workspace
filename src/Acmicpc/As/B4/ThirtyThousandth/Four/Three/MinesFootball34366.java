package Acmicpc.As.B4.ThirtyThousandth.Four.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinesFootball34366 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine()), v = 0, sum = 0;
		int s1 = Integer.MIN_VALUE, s2 = Integer.MAX_VALUE, s3 = Integer.MIN_VALUE, s4 = Integer.MAX_VALUE;
		String str = null;
		
		while(M-- > 0) {
			str = br.readLine();
			sum = 0;
			for (int i = 1; i < str.split(" ").length; i++) {
				v = Integer.parseInt(str.split(" ")[i]);
				s1 = Math.max(s1, v);
				s2 = Math.min(s2, v);
				sum += v;
			}
			s3 = Math.max(s3, sum);
			s4 = Math.min(s4, sum);
		}
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		br.close();
	}
}
