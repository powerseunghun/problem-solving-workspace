package Acmicpc.As.B2.ThirtyThousandth.Four.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TigerBirdWar34237 {
	static int[] arr1 = null, arr2 = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		int g = 0, x = 0, y = 0, res = 0;
		arr1 = new int[N];
		arr2 = new int[N];
		
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			arr1[i] = Integer.parseInt(str.split(" ")[0]);
			arr2[i] = Integer.parseInt(str.split(" ")[1]);
		}
		for (int i = 0; i < M; i++) {
			res = 0;
			str = br.readLine();
			g = Integer.parseInt(str.split(" ")[0]);
			x = Integer.parseInt(str.split(" ")[1]);
			y = Integer.parseInt(str.split(" ")[2]);
			
			for (int j = 0; j < N; j++) {
				if (arr1[j] >= x && arr2[j] >= y && arr1[j] + arr2[j] <= g) {
					res++;
				}
			}
			sb.append(res).append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
