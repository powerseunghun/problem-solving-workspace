package Acmicpc.As.B1.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecretEmail2999 {
	static char[][] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int n = str.length(), r = (int)Math.floor(Math.sqrt(str.length()));
		
		while(n % r != 0) {
			r--;
		}
		int c = n/r;
		
		arr = new char[c][r];
		
		for (int i = 0; i < n; i++) {
			arr[i/r][i%r] = str.charAt(i);
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sb.append(arr[j][i]);
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
