package SWExpertAcademy.D2.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NewInsomniaCure1288 {
	static boolean check(int[] arr) {
		for (int el : arr) {
			if (el == 0) return false;
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[10];
		long N = 0, tN = 0;
		
		for (int i = 1; i <= T; i++) {
			N = Long.parseLong(br.readLine());
			tN = N;
			Arrays.fill(arr, 0);
			sb.append("#" + i + " ");
			for (int j = 1;; j++) {
				N = tN * j;
				tmp = N + "";
				for (int k = 0; k < tmp.length(); k++) {
					arr[tmp.charAt(k)-'0']++;
				}
				if (check(arr)) {
					sb.append(N + "\n");
					break;
				}
			}
		}
		System.out.print(sb.toString());
	}
}
