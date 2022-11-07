package Acmicpc.As.B4.TwentyThousandth.Five.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindTheTwins25932 {
	static boolean[] arr = new boolean[100];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), val = 0;
		
		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			Arrays.fill(arr, false);
			while (st.hasMoreTokens()) {
				val = Integer.parseInt(st.nextToken());
				sb.append(val + " ");
				arr[val] = true;
			}
			sb.append("\n");
			sb.append((arr[17] && arr[18]) ? "both" : arr[17] ? "zack" : arr[18] ? "mack" : "none");
			if (T == 0) continue;
			sb.append("\n\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
