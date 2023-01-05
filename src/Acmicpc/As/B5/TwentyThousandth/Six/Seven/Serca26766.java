package Acmicpc.As.B5.TwentyThousandth.Six.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Serca26766 {
	static String[] strs = {" @@@   @@@ ", "@   @ @   @", "@    @    @", "@         @", " @       @ ", "  @     @  ", "   @   @   ", "    @ @    ", "     @     "};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i ++) {
			for (int j = 0; j < strs.length; j++) {
				sb.append(strs[j] + "\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
