package Acmicpc.As.B2.FiveThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Alarmist5121 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine()), n = 0, w = 0, min = 0, max = 0;
		StringTokenizer st = null;
		String tmp = null;
		
		for (int tc = 1; tc <= K; tc++) {
			tmp = br.readLine();
			n = Integer.parseInt(tmp.split(" ")[0]);
			w = Integer.parseInt(tmp.split(" ")[1]);
			arr = new int[n+1];
			st = new StringTokenizer(br.readLine());
			
			arr[0] = 0;
			for (int i = 1; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				arr[i] += arr[i-1];
			}
			
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
			for (int i = w, b = 0; i < arr.length; i++, b++) {
				min = Math.min(min, (int) Math.floor((arr[i]-arr[b]) / (double)w));
				max = Math.max(max, (int) Math.floor((arr[i]-arr[b]) / (double)w));
			}
			sb.append("Data Set ").append(tc).append(":").append("\n").append(max-min).append("\n");
			if (tc != K) sb.append("\n"); 
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
