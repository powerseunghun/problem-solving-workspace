package Codeforce.OrderSubmit.OneThousandth.FiveHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TeamOlympiad {
	static int[][] arr = null;
	static int[] tech = new int[4];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()), res = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[4][n+1];
		
		for (int i = 1, val = 0; i <= n; i++) {
			val = Integer.parseInt(st.nextToken());
			arr[val][tech[val]++] = i;
		}
		res = Math.min(tech[1], Math.min(tech[2], tech[3]));
		sb.append(res + "\n");
		
		for (int i = 0; i < res; i++) {
			sb.append(arr[1][i] + " " + arr[2][i] + " " + arr[3][i] + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
