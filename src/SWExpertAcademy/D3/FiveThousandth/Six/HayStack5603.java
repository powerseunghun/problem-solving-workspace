package SWExpertAcademy.D3.FiveThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HayStack5603 {
	static boolean check(int[] arr, int base) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != base) return false;
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = null;
		int T = Integer.parseInt(br.readLine()), N = 0, cnt = 0, base = 0;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			cnt = 0;
			arr = new int[N];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(br.readLine());
				base += arr[j];
			}
			base /= N;
			for (int j = 0; j < arr.length; j++) {
				cnt += Math.abs(arr[j]-base);
			}
			sb.append("#" + i + " " + cnt/2 + "\n");
		}
		System.out.print(sb.toString());
	}
}
