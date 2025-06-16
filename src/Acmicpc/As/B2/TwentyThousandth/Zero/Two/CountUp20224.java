package Acmicpc.As.B2.TwentyThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountUp20224 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int n = 0, res = 0;
		
		while(true) {
			n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			arr = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			res = 0;
			for (int i = 3; i < arr.length; i++) {
				if (arr[i-3]==2 && arr[i-2]==0 && arr[i-1]==2 && arr[i]==0) res++;
			}
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
