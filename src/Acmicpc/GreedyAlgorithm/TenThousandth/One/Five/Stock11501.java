package Acmicpc.GreedyAlgorithm.TenThousandth.One.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stock11501 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), N = 0, maxVal = 0;
		int[] arr = null;
		long sum = 0;
		
		for (int i = 0; i < T; i++) {
			sum = 0;
			maxVal = 0;
			N = Integer.parseInt(br.readLine());
			arr = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			for (int j = arr.length-1; j >= 0; j--) {
				if (arr[j] > maxVal) {
					maxVal = arr[j];
				}
				else sum += maxVal - arr[j];
			}
			sb.append(sum + "\n");
		}
		
		System.out.print(sb.toString());
	}
}
