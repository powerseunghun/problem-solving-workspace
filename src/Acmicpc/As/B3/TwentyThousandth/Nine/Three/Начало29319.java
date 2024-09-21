package Acmicpc.As.B3.TwentyThousandth.Nine.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Начало29319 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = 0, sum = 0, max = Integer.MIN_VALUE;
		
		while(st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			sum += v;
			max = Math.max(max, v);
		}
		
		System.out.println(sum-max);
		br.close();
	}
}
