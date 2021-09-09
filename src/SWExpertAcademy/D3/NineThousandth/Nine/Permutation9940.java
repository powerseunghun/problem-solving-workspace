package SWExpertAcademy.D3.NineThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Permutation9940 {
	static boolean check(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i+1) return false;
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int[] arr = null;
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			if (check(arr)) sb.append("#" + i + " Yes\n");
			else sb.append("#" + i + " No\n");
		}
		System.out.print(sb.toString());
	}
}
