package Acmicpc.As.B3.ThirtyThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JadaeBatch35271 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		arr = new int[M];
		str = br.readLine();
		
		for (int i = 0; i < str.split(" ").length; i++) {
			arr[i] = Integer.parseInt(str.split(" ")[i]);
		}
		
		for (int i = 0, w = 0; i < N; i++) {
			str = br.readLine();
			w = -1;
			for (int j = 0, v = 0; j < 3; j++) {
				v = Integer.parseInt(str.split(" ")[j]);
				if (arr[v-1] > 0) {
					w = v;
					arr[v-1]--;
					break;
				}
			}
			sb.append(w + " ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
