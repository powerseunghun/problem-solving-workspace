package Acmicpc.As.B4.ThirtyThousandth.One.Seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class GlobalPonix3177 {
	static final int len = 3;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Character> set = new HashSet<>();
		
		for (int i = 0; i < len; i++) {
			set.add(br.readLine().charAt(0));
		}
		
		System.out.println(set.contains('k') && set.contains('l') && set.contains('p') ? "GLOBAL" : "PONIX");
		br.close();
	}
}
