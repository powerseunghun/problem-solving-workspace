package Acmicpc.As.B3.TwentyThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameShow20282 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), val = 0, cur = 100, max = Integer.MIN_VALUE;
		
		while (N-- > 0) {
			val = Integer.parseInt(br.readLine());
			cur += val;
			max = Math.max(max, cur);
		}
		
		System.out.println(Math.max(max, 100));
		br.close();
	}
}
