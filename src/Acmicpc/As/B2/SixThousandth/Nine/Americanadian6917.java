package Acmicpc.As.B2.SixThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Americanadian6917 {
	static Set<Character> conSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y'));
	static boolean func(String str) {
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		return set.size() >= 4 
				&& str.substring(str.length()-2, str.length()).equals("or") 
				&& !conSet.contains(str.charAt(str.length()-3));
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		
		while (true) {
			str = br.readLine();
			if (str.equals("quit!")) break;
			sb.append(func(str) ? (str.substring(0, str.length()-2) + "our") : str).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
