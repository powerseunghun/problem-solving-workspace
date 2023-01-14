package Acmicpc.As.B3.TwentyThousandth.Six.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelCount26314 {
	static int func(String str) {
		int vc = str.replaceAll("a|e|i|o|u", "").length();
		return vc >= str.length()-vc ? 0 : 1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			sb.append(str + "\n" + func(str) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
