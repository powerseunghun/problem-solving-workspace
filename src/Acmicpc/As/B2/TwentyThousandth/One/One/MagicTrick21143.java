package Acmicpc.As.B2.TwentyThousandth.One.One;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class MagicTrick21143 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Set<Character> set = new HashSet<>();
		boolean flag = true;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (set.contains(c)) {
				flag = false;
				break;
			}
			set.add(c);
		}
		
		System.out.println(flag ? "1" : "0");
		br.close();
	}
}
