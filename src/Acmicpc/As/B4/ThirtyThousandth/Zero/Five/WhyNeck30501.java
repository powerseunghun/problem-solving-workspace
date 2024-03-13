package Acmicpc.As.B4.ThirtyThousandth.Zero.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhyNeck30501 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = null, res = null;
		
		while(N-- > 0) {
			str = br.readLine();
			if (str.contains("S")) {
				res = str;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
