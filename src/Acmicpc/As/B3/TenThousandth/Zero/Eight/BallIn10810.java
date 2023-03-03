package Acmicpc.As.B3.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BallIn10810 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[N];
		
		for (int i = 1, s = 0, e = 0, w = 0; i <= M; i++) {
			tmp = br.readLine();
			s = Integer.parseInt(tmp.split(" ")[0]);
			e = Integer.parseInt(tmp.split(" ")[1]);
			w = Integer.parseInt(tmp.split(" ")[2]);
			for (int j = s; j <= e; j++) {
				arr[j-1] = w;
			}
		}
		
		for (int el : arr) {
			sb.append(el + " ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
