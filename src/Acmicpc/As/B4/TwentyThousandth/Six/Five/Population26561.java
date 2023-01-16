package Acmicpc.As.B4.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Population26561 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int N = Integer.parseInt(br.readLine()), s = 0, t = 0;
		
		while (N-- > 0) {
			tmp = br.readLine();
			s = Integer.parseInt(tmp.split(" ")[0]);
			t = Integer.parseInt(tmp.split(" ")[1]);
			s -= t/7;
			s += t/4;
			sb.append(s + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
