package Acmicpc.OrderSubmit.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ScoreCalculation2506 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0, w = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int el : arr) {
			if (el == 1) {
				sum += (1 + (w++));
			}
			else w = 0;
		}
		
		System.out.println(sum);
		br.close();
	}
}
