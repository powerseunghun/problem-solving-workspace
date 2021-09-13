package SWExpertAcademy.D3.SevenThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ProblemTitle7087 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), N = 0, cnt = 0;
		int[] arr = new int[26];
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			Arrays.fill(arr, 0);
			cnt = 0;
			for (int j = 0; j < N; j++) {
				tmp = br.readLine();
				arr[tmp.charAt(0)-65]++;
			}
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == 0) break;
				cnt++;
			}
			sb.append("#" + i + " " + cnt + "\n");
		}
		System.out.print(sb.toString());
	}
}
