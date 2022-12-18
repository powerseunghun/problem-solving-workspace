package Acmicpc.As.B5.FiveThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pyramids5341 {
	static int func(int n) {
		int res = (1+n) * n/2;
		return n == 1 ? 1 : res;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 0;
		
		while (true) {
			n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			sb.append(func(n) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
