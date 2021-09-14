package SWExpertAcademy.D3.SixThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IncreaseNumber6190 {
	static boolean check(int n) {
		String str = n + "";
		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i) > str.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	static int func(int[] arr) {
		int max = -1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) continue;
				else if (check(arr[i] * arr[j])) max = Math.max(max, arr[i] * arr[j]);
			}
		}
		return max;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), N = 0;
		int[] arr = null;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			sb.append("#" + i + " " + func(arr) + "\n");
		}
		System.out.print(sb.toString());
	}
}
