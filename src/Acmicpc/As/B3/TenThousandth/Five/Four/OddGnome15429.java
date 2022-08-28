package Acmicpc.As.B3.TenThousandth.Five.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OddGnome15429 {
	static int[] arr = null;
	static int func() {
		int idx = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]-1 == arr[i-1]) continue;
			return i+1;
		}
		return 1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), g = 0;
		
		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			g = Integer.parseInt(st.nextToken());
			arr = new int[g];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			sb.append(func() + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
