package Acmicpc.As.B3.TenThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HelmetVest15781 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		br.readLine();
		int max = 0, sum = 0;
		
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			max = Integer.MIN_VALUE;
			while (st.hasMoreTokens()) {
				max = Math.max(max, Integer.parseInt(st.nextToken()));
			}
			sum += max;
		}
		
		System.out.println(sum);
		br.close();
	}
}
