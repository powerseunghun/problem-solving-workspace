package SWExpertAcademy.D3.EightThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodingTournament8673 {
	static int func(int[] arr, int K) {
		int res = 0;
		int[] arr2 = null;
		while (K > 0) {
			arr2 = new int[(int)Math.pow(2, K-1)];
			for (int i = 0; i < Math.pow(2, K); i+= 2) {
				arr2[i/2] = Math.max(arr[i], arr[i+1]);
				res += Math.abs(arr[i]-arr[i+1]);
			}
			arr = arr2;
			K--;
		}
		return res;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), K = 0;
		int[] arr = null;
		
		for (int i = 1; i <= T; i++) {
			K = Integer.parseInt(br.readLine());
			arr = new int[(int)Math.pow(2, K)];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			sb.append("#" + i + " " + func(arr, K) + "\n");
		}
		System.out.print(sb.toString());
	}
}
