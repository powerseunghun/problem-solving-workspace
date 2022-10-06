package Acmicpc.As.B3.TwentyThousandth.Two.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SharpShooter22938 {
	// 0 = x1, 1 = x2, 2 = y1, 3 = y2, 4 = r1, 5 = r2
	static long[] arr = new long[6];
	static boolean check() {
		return Math.sqrt(Math.pow(arr[0]-arr[1], 2) + Math.pow(arr[2]-arr[3], 2)) < arr[4]+arr[5];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = i; j < arr.length; j+=2) {
				arr[j] = Long.parseLong(st.nextToken());
			}
		}
		
		System.out.println(check() ? "YES" : "NO");
		br.close();
	}
}
