package Acmicpc.As.B4.TwoThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheSecondLargestInteger20976 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int val = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;
		
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			sum += val;
			max = Math.max(max, val);
			min = Math.min(min, val);
		}
		
		System.out.println(sum - max - min);
		br.close();
	}
}
