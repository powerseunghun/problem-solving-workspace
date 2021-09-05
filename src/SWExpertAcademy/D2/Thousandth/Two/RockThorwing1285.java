package SWExpertAcademy.D2.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RockThorwing1285 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int[] arr = new int[100001];
		int T = Integer.parseInt(br.readLine()), N = 0, val = 0, min = Integer.MAX_VALUE;
		
		for (int i = 1; i <= T; i++) {
			Arrays.fill(arr, 0);
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				val = Math.abs(Integer.parseInt(st.nextToken()));
				min = Math.min(min, val);
				arr[val]++;
			}
			sb.append("#" + i + " " + min + " " + arr[min] + "\n");
		}
		System.out.print(sb.toString());
	}
}
