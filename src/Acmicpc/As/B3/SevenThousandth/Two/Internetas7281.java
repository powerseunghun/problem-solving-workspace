package Acmicpc.As.B3.SevenThousandth.Two;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class Internetas7281 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0, t = 0, v = 0, p = 0;
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			t = Integer.parseInt(str.split(" ")[0]);
			v = Integer.parseInt(str.split(" ")[1]);
			if (v == 0) continue;
			res = Math.max(res, t-p);
			p = t;
		}
		
		System.out.println(res);
		br.close();
	}
}
