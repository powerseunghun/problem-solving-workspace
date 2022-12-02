package Acmicpc.As.B3.TwentyThousandth.Five.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountingPeaksOfInfection25527 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int N = 0, cnt = 0;
		
		while(true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0) break;
			cnt = 0;
			st = new StringTokenizer(br.readLine());
			arr = new int[N];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			for (int i = 1; i < arr.length-1; i++) {
				if (arr[i-1] < arr[i] && arr[i] > arr[i+1]) cnt++;
			}
			sb.append(cnt + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
