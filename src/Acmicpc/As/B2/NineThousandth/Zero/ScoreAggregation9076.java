package Acmicpc.As.B2.NineThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ScoreAggregation9076 {
	static final int len = 5;
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), sum = 0;
		int max = 0, min = 0, subMax = 0, subMin = 0;
		StringTokenizer st = null; 
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			sum = 0;
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
			arr = new int[len];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				max = Math.max(max, arr[i]);
				min = Math.min(min, arr[i]);
			}
			subMax = Integer.MIN_VALUE;
			subMin = Integer.MAX_VALUE;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == max) {
					max = Integer.MIN_VALUE;
					continue;
				}
				else if (arr[i] == min) {
					min = Integer.MAX_VALUE;
					continue;
				}
				sum += arr[i];
				subMax = Math.max(subMax, arr[i]);
				subMin = Math.min(subMin, arr[i]);
			}
			sb.append(subMax-subMin > 3 ? "KIN" : sum).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
