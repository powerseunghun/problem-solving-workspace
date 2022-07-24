package Acmicpc.As.B3.TenThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinionsMaster11262 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		double sum = 0, avg = 0;
		StringTokenizer st = null;
		
		while (T-- > 0) {
			sum = 0;
			avg = 0;
			st = new StringTokenizer(br.readLine());
			arr = new int[Integer.parseInt(st.nextToken())];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				sum += arr[i];
			}
			sum /= arr.length;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > sum) avg++;
			}
			avg = avg / arr.length * 100;
			
			sb.append(String.format("%.3f %.3f%%\n", sum, avg));
		}
		System.out.print(sb.toString());
		br.close();
	}
}
