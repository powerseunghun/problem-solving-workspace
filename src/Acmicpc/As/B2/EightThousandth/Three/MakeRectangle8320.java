package Acmicpc.As.B2.EightThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeRectangle8320 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), res = 0;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				res += i*j <= n ? 1 : 0;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
