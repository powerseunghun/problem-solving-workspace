package Acmicpc.As.B4.ThirtyThousandth.One.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IsYaVowel31306 {
	static Set<Character> set = new HashSet<Character>(Arrays.asList('a','e','i','o','u','y'));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (set.contains(str.charAt(i))) {
				res++;
			}
		}
		
		System.out.println(res-(str.length()-str.replaceAll("y", "").length()) + " " + res);
		br.close();
	}
}
