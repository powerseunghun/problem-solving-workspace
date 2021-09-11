package SWExpertAcademy.D3.EightThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Calculator8338 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int[] arr = null;
		int T = Integer.parseInt(br.readLine()), ans = 0, N = 0;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			ans = arr[0];
			
			for (int j = 1; j < arr.length; j++) {
				ans = ans + arr[j] >= ans * arr[j] ? ans + arr[j] : ans * arr[j];
			}
			sb.append("#" + i + " " + ans + "\n");
		}
		System.out.print(sb.toString());
	}
}
