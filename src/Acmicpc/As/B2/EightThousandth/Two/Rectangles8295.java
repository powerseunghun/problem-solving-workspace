package Acmicpc.As.B2.EightThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangles8295 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int m = Integer.parseInt(str.split(" ")[1]);
		int p = Integer.parseInt(str.split(" ")[2]), res = 0;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if ((i+j)*2 < p) continue;
				res += (n-i+1) * (m-j+1);
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
