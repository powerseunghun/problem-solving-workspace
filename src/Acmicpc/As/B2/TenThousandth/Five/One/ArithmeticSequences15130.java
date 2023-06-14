package Acmicpc.As.B2.TenThousandth.Five.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArithmeticSequences15130 {
	static int[] idxs = new int[2], vals = new int[2];
	static int[] arr = new int[10];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int idx = -1, t = 0, v = 0;
		double d = 0;
		
		while (st.hasMoreTokens()) {
			idx++;
			v = Integer.parseInt(st.nextToken());
			arr[idx] = v;
			if (v == 0) continue;
			idxs[t] = idx;
			vals[t++] = v;
		}
		d = (vals[1] - vals[0]) / (double)(idxs[1] - idxs[0]);
		
		if (d - (int)d != 0) {
			System.out.println("EE");
			sb.append("-1");
		}
		
		if (sb.toString().equals("")) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 0) {
					arr[i] = (int) (i == 0 ? vals[0] - (idxs[0] * d) : arr[0] + i * d);
				}
				sb.append(arr[i]).append(" ");
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
