package Acmicpc.As.B4.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse26546 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int N = Integer.parseInt(br.readLine()), s = 0, e = 0;
		
		while(N-- > 0) {
			tmp = br.readLine();
			s = Integer.parseInt(tmp.split(" ")[1]);
			e = Integer.parseInt(tmp.split(" ")[2]);
			tmp = tmp.split(" ")[0];
			sb.append(tmp.substring(0, s) + tmp.substring(e, tmp.length()) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
