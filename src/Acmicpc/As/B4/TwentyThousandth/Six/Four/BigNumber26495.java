package Acmicpc.As.B4.TwentyThousandth.Six.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigNumber26495 {
	static StringBuilder sb = new StringBuilder();
	static String[][][] strs = {
			{{"0000", "0  0", "0  0", "0  0", "0000"}},
			{{"   1", "   1", "   1", "   1", "   1"}},
			{{"2222", "   2", "2222", "2", "2222"}},
			{{"3333", "   3", "3333", "   3", "3333"}},
			{{"4  4", "4  4", "4444", "   4", "   4"}},
			{{"5555", "5", "5555", "   5", "5555"}},
			{{"6666", "6", "6666", "6  6", "6666"}},
			{{"7777", "   7", "   7", "   7", "   7"}},
			{{"8888", "8  8", "8888", "8  8", "8888"}},
			{{"9999", "9  9", "9999", "   9", "   9"}},
	};
	static void func(int n, boolean flag) {
		for (int i = 0; i < strs[n][0].length; i++) {
			sb.append(strs[n][0][i]+ (!flag&&i==strs[n][0].length-1 ? "" : "\n"));
		}
		if (!flag) return;
		sb.append("\n");
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			func(str.charAt(i)-'0', i==str.length()-1 ? false : true);
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
