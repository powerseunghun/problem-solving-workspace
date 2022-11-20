package Acmicpc.As.B3.TwentyThousandth.Six.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class CharacterChange26040 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new HashSet<>();
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			set.add(st.nextToken().charAt(0));
		}
		
		for (int i = 0; i < str.length(); i++) {
			sb.append(set.contains(str.charAt(i)) ? (char)(str.charAt(i)+32) : str.charAt(i));
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
