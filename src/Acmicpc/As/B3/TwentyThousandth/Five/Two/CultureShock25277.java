package Acmicpc.As.B3.TwentyThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class CultureShock25277 {
	static Set<String> set = new HashSet<>();
	static void init() {
		String[] strs = {"he", "him", "she", "her"};
		for (String str : strs) {
			set.add(str);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int res = 0;
		
		init();
		while (st.hasMoreTokens()) {
			res = set.contains(st.nextToken()) ? res+1 : res;
		}
		
		System.out.println(res);
		br.close();
	}
}
