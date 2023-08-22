package Acmicpc.As.B1.TenThousandth.Six.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarNumber16968 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = str.charAt(0) == 'c' ? 26 : 10;
		
		for (int i = 1; i < str.length(); i++) {
			res *= str.charAt(i-1) == str.charAt(i) 
					? str.charAt(i) == 'c' ? 25 : 9
					: str.charAt(i) == 'c' ? 26 : 10;
		}
		
		System.out.println(res);
		br.close();
	}
}
