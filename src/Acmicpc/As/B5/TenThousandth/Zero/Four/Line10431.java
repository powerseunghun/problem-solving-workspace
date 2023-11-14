package Acmicpc.As.B5.TenThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Line10431 {
	static final int len = 20;
	static int[] arr = new int[len];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), res = 0;
		StringTokenizer st = null;
		
//		while(T-- > 0) {
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			
			Arrays.fill(arr, 0);
			res = 0;
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			for (int j = 1; j < arr.length; j++) {
				for (int k = j-1; k >= 0; k--) {
					res = arr[k] > arr[j] ? res+1 : res;
				}
			}
			sb.append(i).append(" ").append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
