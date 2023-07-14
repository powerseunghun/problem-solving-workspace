package Acmicpc.As.B2.TwentyThousandth.Three.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BikeTour23901 {
	static int[] arr = null;
	static int check() {
		int res = 0;
		for (int i = 1; i < arr.length-1; i++) {
			res = arr[i] > arr[i-1] && arr[i+1] < arr[i] ? res + 1 : res;
		}
		return res;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), l = 0;
		StringTokenizer st = null;
		
		for (int i = 1; i <= T; i++) {
			l = Integer.parseInt(br.readLine());
			arr = new int[l];
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			//Case #1: 1
			sb.append("Case #").append(i).append(": ").append(check()).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
