package Acmicpc.As.B2.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class ElfSword4436 {
	static final int target = 10;
	static Set<Character> set = new HashSet<>();
	static void func(long N) {
		String str = String.valueOf(N);
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		long N = 0;
		
		while ((tmp = br.readLine()) != null) {
			set.clear();
			tmp = br.readLine();
			N = Integer.parseInt(tmp);
			for (int k = 1; ; k++) {
				func(N * k);
				if (set.size() == target) {
					sb.append(k).append("\n");
					break;
				}
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
