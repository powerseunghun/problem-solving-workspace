package SWExpertAcademy.D3.NineThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BestPair9839 {
	static boolean check(int N) {
		int val = N%10;
		N /= 10;
		while (N != 0) {
			if (val-1 != N % 10) return false;
			val = N % 10;
			N /= 10;
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), N = 0, max = 0, val = 0;
		int[] arr = null;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			max = -1;
			arr = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			for (int j = 0; j < arr.length-1; j++) {
				for (int k = j+1; k < arr.length; k++) {
					val = arr[j] * arr[k];
					if (check(val)) {
						max = Math.max(val, max);
					}
				}
			}
			sb.append("#" + i + " " + max + "\n");
		}
		System.out.print(sb.toString());
	}
}
