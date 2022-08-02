package Acmicpc.As.B3.TenThousandth.Three.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lobby13063 {
	static int calc(int n, int m, int k) {
		int mss = n-(m+k);
		
		for (int i = 0; i <= mss; i++) {
			if (m+i > k+(mss-i)) return i;
		}
		return -1;
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 0, m = 0, k = 0;
		String tmp = null;
		
		while (true) {
			tmp = br.readLine();
			n = Integer.parseInt(tmp.split(" ")[0]);
			m = Integer.parseInt(tmp.split(" ")[1]);
			k = Integer.parseInt(tmp.split(" ")[2]);
			if (n == 0 && m == 0 && k == 0) break;
			
			sb.append(calc(n, m, k) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
