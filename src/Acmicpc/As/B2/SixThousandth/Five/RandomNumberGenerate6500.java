package Acmicpc.As.B2.SixThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import Acmicpc.Sorting.TwoThousandth.Nine.FeequencySort2910;

public class RandomNumberGenerate6500 {
	static int func(String str) {
		int val = 0;
		Set<String> set = new HashSet<>();
		while (!set.contains(str)) {
			set.add(str);
			val = (int) Math.pow(Integer.parseInt(str), 2);
			str = String.valueOf(val);
			while (str.length() != 4*2) {
				str = "0" + str;
			}
			str = str.substring(2, 4+2);
		}
		return set.size();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		
		while(true) {
			str = br.readLine();
			if (str.equals("0")) break;
			sb.append(func(str)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
