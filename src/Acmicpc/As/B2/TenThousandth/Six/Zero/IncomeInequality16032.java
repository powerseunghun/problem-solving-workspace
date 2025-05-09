package Acmicpc.As.B2.TenThousandth.Six.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IncomeInequality16032 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = 0, sum = 0, cnt = 0;
		
		while(true) {
			T = Integer.parseInt(br.readLine());
			if (T == 0) break;
			arr = new int[T];
			st = new StringTokenizer(br.readLine());
			sum = 0; cnt = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				sum += arr[i];
			}
			
			for (int el : arr) {
				if (el <= sum/T) cnt++;
			}
			sb.append(cnt).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
