package SWExpertAcademy.D2.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MaxFrequencyNumber1204 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), max = 0, val = 0;
		int[] arr = new int[101];
		
		for (int i = 1; i <= T; i++) {
			br.readLine();
			Arrays.fill(arr, 0);
			max = Integer.MIN_VALUE;
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				val = Integer.parseInt(st.nextToken());
				arr[val]++;
				max = Math.max(arr[val], max);
			}
			sb.append("#" + i + " ");
			for (int j = arr.length-1; j >= 0; j--) {
				if (arr[j] == max) {
					sb.append(j + "\n");
					break;
				}
			}
		}
		System.out.print(sb.toString());
	}
}
