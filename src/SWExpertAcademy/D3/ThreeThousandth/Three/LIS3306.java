package SWExpertAcademy.D3.ThreeThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LIS3306 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int[] arr = null, lis = null;
		int T = Integer.parseInt(br.readLine()), N = 0, max = 0;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N];
			lis = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			max = 1;
			for (int j = 0; j < N; j++) {
				lis[j] = 1;
				for (int k = 0; k < N; k++) {
					if (arr[k] < arr[j] && lis[j] < lis[k]+1) lis[j] = lis[k]+1;
					max = Math.max(lis[j], max);
				}
			}
			sb.append("#" + i + " " + max + "\n");
		}
		System.out.print(sb.toString());
	}
}
