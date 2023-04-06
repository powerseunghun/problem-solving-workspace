package Acmicpc.As.B2.SixThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HayExpenses6081 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]), a = 0, b = 0;
		int Q = Integer.parseInt(tmp.split(" ")[1]), max = 0, min = 0;
		arr = new int[N+1];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			arr[i] += arr[i-1];
		}
		while(Q-- > 0) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			max = Math.max(a, b);
			min = Math.min(a, b);
			sb.append(arr[max] - arr[min-1]).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
