package Acmicpc.As.B3.ThirtyThousandth.Three.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class PNUPC33845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Set<Character> cSet = new HashSet<>();
		
		for (char c : br.readLine().toCharArray()) {
			cSet.add(c);
		}
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			sb.append(cSet.contains(c) ? "" : c);
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
