package Acmicpc.As.B3.TenThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PersianKings10599 {
	static int[] arr = new int[4];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int age1 = 0, age2 = 0;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0 && arr[3] == 0) break;
			Arrays.sort(arr);
			
			age1 = Math.abs(arr[3]-arr[0]);
			age2 = Math.abs(arr[2]-arr[1]);
			
			sb.append(Math.min(age1, age2) + " " + Math.max(age1, age2) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
