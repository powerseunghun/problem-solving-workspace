package Acmicpc.As.B1.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CardGame10801 {
	static int[][] arr = new int[2][10];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int winA = 0, winB = 0;
		
		for (int i = 0, v = 0, idx = 0; i < arr.length; i++, idx = 0) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				v = Integer.parseInt(st.nextToken());
				arr[i][idx++] = v;
			}
		}
		
		for (int i = 0; i < arr[0].length; i++) {
			if (arr[0][i] > arr[1][i]) winA++;
			else if (arr[0][i] < arr[1][i]) winB++;
		}
		
		System.out.println(winA == winB ? "D" : winA > winB ? "A" : "B");
		br.close();
	}
}
