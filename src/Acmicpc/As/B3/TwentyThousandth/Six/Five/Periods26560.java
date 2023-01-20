package Acmicpc.As.B3.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Periods26560 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			sb.append(str.charAt(str.length()-1) != '.' ? str+".\n" : str+"\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
