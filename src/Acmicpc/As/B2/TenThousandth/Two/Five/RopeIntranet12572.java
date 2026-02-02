package Acmicpc.As.B2.TenThousandth.Two.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RopeIntranet12572 {
	static int[] arr1 = null, arr2 = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, res = 0;
		String str = null;
		
		for (int a = 1; a <= T; a++) {	
			N = Integer.parseInt(br.readLine());
			arr1 = new int[N];
			arr2 = new int[N];
			
			for (int i = 0; i < N; i++) {
				str = br.readLine();
				arr1[i] = Integer.parseInt(str.split(" ")[0]);
				arr2[i] = Integer.parseInt(str.split(" ")[1]);
			}
			
			res = 0;
			for (int i = 0; i < N-1; i++) {
				for (int j = i+1; j < N; j++) {
					if ((arr1[i]-arr1[j]) * (arr2[i]-arr2[j]) < 0) {
						res++;
					}
				}
			}
			sb.append("Case #").append(a).append(": ").append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
