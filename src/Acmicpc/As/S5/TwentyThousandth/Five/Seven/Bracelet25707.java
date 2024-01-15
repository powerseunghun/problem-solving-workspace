package Acmicpc.As.S5.TwentyThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bracelet25707 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		while(st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			max = Math.max(max, v);
			min = Math.min(min, v);
		}
		
		System.out.println((max-min)*2);
		br.close();
	}
}
