package Acmicpc.As.B5.ThirtyThousandth.Zero.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ramyun30007 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), a = 0, b = 0, x = 0;
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			x = Integer.parseInt(str.split(" ")[2]);
			sb.append(a * (x-1) + b).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
