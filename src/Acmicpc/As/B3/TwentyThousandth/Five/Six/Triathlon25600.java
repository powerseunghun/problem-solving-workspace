package Acmicpc.As.B3.TwentyThousandth.Five.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triathlon25600 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = Integer.MIN_VALUE;
		int a = 0, d = 0, g = 0, score = 0;
		String tmp = null;
		
		while(N-- > 0) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			d = Integer.parseInt(tmp.split(" ")[1]);
			g = Integer.parseInt(tmp.split(" ")[2]);
			score = (a == (d+g)) ? (a*(d+g)) * 2 : a*(d+g);
			max = Math.max(max, score);
		}
		
		System.out.println(max);
		br.close();
	}
}
