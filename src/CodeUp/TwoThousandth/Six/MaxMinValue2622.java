package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxMinValue2622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = -1, min = 32768, val = 0, idx = 0;
		int maxIdx = 0, minIdx = 0;
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			idx++;
			val = Integer.parseInt(st.nextToken());
			if (val > max) {
				max = val;
				maxIdx = idx;
			}
			if (val < min) {
				min = val;
				minIdx = idx;
			}
		}
		
		System.out.println(maxIdx + " : " + max);
		System.out.println(minIdx + " : " + min);
	}
}
