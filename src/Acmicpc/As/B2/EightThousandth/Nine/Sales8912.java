package Acmicpc.As.B2.EightThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sales8912 {
	static int[] arr = null, arr2 = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N];
			arr2 = new int[N-1];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			for (int i = 1; i <= N-1; i++) {
				for (int j = 0; j < i; j++) {
					if (arr[j] <= arr[i]) arr2[i-1]++;
				}
			}
			int sum = 0;
			for (int el : arr2) {
				sum += el;
			}
			sb.append(sum).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
