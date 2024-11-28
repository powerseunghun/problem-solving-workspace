package Acmicpc.As.B3.TwentyThousandth.Nine.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Свидание29220 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		long sum = 0, min = Long.MAX_VALUE, v = 0;
		
		while(st.hasMoreTokens()) {
			v = Long.parseLong(st.nextToken());
			sum += v;
			min = Math.min(v, min);
		}
		
		System.out.println(sum-min >= k ? "YES" : "NO");
		br.close();
	}
}
