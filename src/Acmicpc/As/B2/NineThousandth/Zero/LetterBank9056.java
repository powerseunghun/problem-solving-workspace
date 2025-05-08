package Acmicpc.As.B2.NineThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class LetterBank9056 {
	static Set<Character> set = new HashSet<Character>();
	static void toSet(String str) {
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
	}
	static boolean func(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (!set.contains(str.charAt(i))) return false;
			set.remove(str.charAt(i));
		}
		return set.isEmpty();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		while(T-- > 0) {
			set.clear();
			str = br.readLine();
			toSet(str.split(" ")[1]);
			sb.append(func(str.split(" ")[0]) ? "YES" : "NO").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
