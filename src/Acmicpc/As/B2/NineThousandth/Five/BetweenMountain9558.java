package Acmicpc.As.B2.NineThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BetweenMountain9558 {
	static int[] arr1 = null, arr2 = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), l = 0, res = 0;
		StringTokenizer st = null;
		
		while(T-- > 0) {
			for (int i = 0; i < 2; i++) {
				st = new StringTokenizer(br.readLine());
				l = Integer.parseInt(st.nextToken());
				if (i == 0) {
					arr1 = new int[l];
					for (int j = 0; j < l; j++) {
						arr1[j] = Integer.parseInt(st.nextToken());
					}
					continue;
				}
				arr2 = new int[l];
				for (int j = 0; j < l; j++) {
					arr2[j] = Integer.parseInt(st.nextToken());
				}
			}
			
			res = Integer.MAX_VALUE;
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					res = Math.min(Math.abs(arr1[i]-arr2[j]), res);
				}
			}
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
