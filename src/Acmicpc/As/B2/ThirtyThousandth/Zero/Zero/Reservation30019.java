package Acmicpc.As.B2.ThirtyThousandth.Zero.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reservation30019 {
	static int[] arr = null;
	static boolean func(String str) {
		int k = Integer.parseInt(str.split(" ")[0]);
		int s = Integer.parseInt(str.split(" ")[1]);
		int e = Integer.parseInt(str.split(" ")[2]);
		if (s < arr[k]) return false;
		arr[k] = e;
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		arr = new int[N+1];
		
		while(M-- > 0) {
			str = br.readLine();
			sb.append(func(str) ? "YES" : "NO").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
