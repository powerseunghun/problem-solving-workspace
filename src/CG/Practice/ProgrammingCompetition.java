package CG.Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ProgrammingCompetition {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, max = Integer.MIN_VALUE, count = 0;
		int[] arr = null;
		
		for (int i = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N];
			for (int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(br.readLine());
			}
			count = 0;
			Arrays.sort(arr);
			
			for (int j = 0, v = N; j < arr.length; j++, v--) {
				max = Math.max(max, arr[j] + v);
			}
			
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] + N >= max) count++;
			}
			sb.append("Case #" + (i+1) + "\n");
			sb.append(count + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
