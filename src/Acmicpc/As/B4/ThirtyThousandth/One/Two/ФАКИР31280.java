package Acmicpc.As.B4.ThirtyThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ФАКИР31280 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = 0, min = Integer.MAX_VALUE, sum = 0;
		
		while(st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			sum += v;
			min = Math.min(min, v);
		}
		
		System.out.println(sum-min+1);
		br.close();
	}
}
