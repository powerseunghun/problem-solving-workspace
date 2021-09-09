package SWExpertAcademy.D3.TenThousandth.Zero.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnackDistribution10032 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), N = 0, K = 0, idx = 0;
		int max = 0, min = 0;
		int[] arr = null;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			idx = 0;
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
			N = Integer.parseInt(tmp.split(" ")[0]);
			K = Integer.parseInt(tmp.split(" ")[1]);
			arr = new int[K];
			for (int j = 0; j < N; j++) {
				arr[idx]++;
				idx++;
				idx %= K;
			}
			for (int el : arr) {
				max = Math.max(max, el);
				min = Math.min(min, el);
			}
			sb.append("#" + i + " " + (max-min) + "\n");
		}
		System.out.print(sb.toString());
	}
}
