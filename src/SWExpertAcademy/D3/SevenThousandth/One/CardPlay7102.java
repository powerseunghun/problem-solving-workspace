package SWExpertAcademy.D3.SevenThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CardPlay7102 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0, max = 0;
		int[] arr = new int[41];
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			max = Integer.MIN_VALUE;
			Arrays.fill(arr, 0);
			sb.append("#" + i + " ");
			N = Integer.parseInt(tmp.split(" ")[0]);
			M = Integer.parseInt(tmp.split(" ")[1]);
			for (int j = 1; j <= N; j++) {
				for (int k = 1; k <= M; k++) {
					arr[j+k]++;
					max = Math.max(arr[j+k], max);
				}
			}
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] == max) sb.append(j + " ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
