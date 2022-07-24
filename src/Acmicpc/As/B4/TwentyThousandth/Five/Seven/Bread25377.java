package Acmicpc.As.B4.TwentyThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bread25377 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), A = 0, B = 0, min = Integer.MAX_VALUE;
		String tmp = null;
		
		while (N-- > 0) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			
			min = A <= B ? Math.min(min, B) : min;
		}
		
		System.out.println(min == Integer.MAX_VALUE ? -1 : min);
		br.close();
	}
}
