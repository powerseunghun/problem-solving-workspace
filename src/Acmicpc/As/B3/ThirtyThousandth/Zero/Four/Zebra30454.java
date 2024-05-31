package Acmicpc.As.B3.ThirtyThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Zebra30454 {
	static List<Integer> list = new ArrayList<>();
	static String func1(String str) {
		char c = str.charAt(0);
		StringBuilder sb = new StringBuilder();
		sb.append(c);
		for (int i = 1; i < str.length(); i++) {
			if (c != str.charAt(i)) {
				sb.append(str.charAt(i));
				c = str.charAt(i);
			}
		}
		return sb.toString();
	}
	static int func2(String str) {
		return str.length()-str.replaceAll("1","").length();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int r = 0, max = Integer.MIN_VALUE, res = 0;
		
		while(N-- > 0) {
			str = br.readLine();
			str = func1(str);
			r = func2(str);
			max = Math.max(max, r);
			list.add(r);
		}
		
		for (Integer i : list) {
			res = i == max ? res+1 : res;
		}
		
		System.out.println(max + " " + res);
		br.close();
	}
}
