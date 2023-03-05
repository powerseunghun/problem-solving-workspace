package Acmicpc.As.B2.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ClayBully4636 {
	static int[] arr = null;
	static String[] names = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 0, max = 0, min = 0;
		StringTokenizer st = null;
		String A = null, B = null;
		
		while(true) {
			n = Integer.parseInt(br.readLine());
			if (n == -1) break;
			arr = new int[n];
			names = new String[n];
			Arrays.fill(arr, 1);
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 3; j++) {
					arr[i] *= Integer.parseInt(st.nextToken());
				}
				names[i] = st.nextToken();
				if (arr[i] > max) {
					max = arr[i];
					A = names[i];
				}
				if (arr[i] < min) {
					min = arr[i];
					B = names[i];
				}
			}
			// 22 18 20
			// 16 14 20 15
			sb.append(A).append(" took clay from ").append(B).append(".\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
