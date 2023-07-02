package Acmicpc.As.B2.TwentyThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class yerin20953 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int T = Integer.parseInt(br.readLine());
		long a = 0, b = 0;
		
		while(T-- > 0) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			
			sb.append(((a+b)*(a+b-1)*(a+b)) / 2).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
