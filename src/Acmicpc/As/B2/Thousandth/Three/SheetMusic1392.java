package Acmicpc.As.B2.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SheetMusic1392 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int Q = Integer.parseInt(tmp.split(" ")[1]), w = 0;
		
		arr = new int[N+1];
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (i == 1) continue;
			arr[i] += arr[i-1];
		}
		
		// 0 1 2 3 4
		// 0 2 3 6
		while (Q-- > 0) {
			w = Integer.parseInt(br.readLine());
			for (int i = 0; i < arr.length-1; i++) {
				if (w >= arr[i] && arr[i+1] > w) {
					sb.append((i+1) + "\n");
					break;
				}
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
