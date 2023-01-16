package Acmicpc.As.B4.TwentyThousandth.Six.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PoziomeSerca26772 {
	static String[] strs = {
			" @@@   @@@ ",
			"@   @ @   @",
			"@    @    @",
			"@         @",
			" @       @ ",
			"  @     @  ",
			"   @   @   ",
			"    @ @    ",
			"     @     "
	};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < strs.length; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(strs[i] + " ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
