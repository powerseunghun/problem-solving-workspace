package Acmicpc.As.B2.FourThousandth.Five;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class MadScientist4580 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int k = 0;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			k = Integer.parseInt(st.nextToken());
			if (k == 0) break;
			
			arr = new int[k+1];
			for (int i = 1; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				for (int j = 0; j < arr[i]-arr[i-1]; j++) {
					sb.append(i + " ");
				}
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
