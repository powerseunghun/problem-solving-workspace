package Acmicpc.As.B2.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Guess2966 {
	static int max = 0;
	static String[] ids = {"Adrian", "Bruno", "Goran"};
	static int[] cnts = new int[3];
	static void func(String str) {
		String[] strs = {"ABC", "BABC", "CCAABB"};
		int res = 0;
		for (int i = 0; i < strs.length; i++) {
			// strs[i] = ABC;
			res = 0;
			for (int j = 0, idx = 0; j < str.length(); j++) {
				if (str.charAt(j) == strs[i].charAt(idx)) res++;
				idx++;
				if (idx >= strs[i].length()) idx = 0;
			}
			max = Math.max(res, max);
			cnts[i] = res;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br.readLine();
		String str = br.readLine();
		
		func(str);
		sb.append(max + "\n");
		for (int i = 0; i < cnts.length; i++) {
			if (cnts[i] == max) {
				sb.append(ids[i] + "\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
