package Acmicpc.As.S5.TwentyThousandth.Five.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DuramuriPaper25178 {
	static String str1 = null, str2 = null;
	static boolean func1() {
		int[] arr1 = new int[27];
		int[] arr2 = new int[27];
		for (int i = 0; i < str1.length(); i++) {
			arr1[str1.charAt(i)-'a']++;
			arr2[str2.charAt(i)-'a']++;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) return false;
 		}
		return true;
	}
	static boolean func2() {
		return str1.charAt(0) == str2.charAt(0) && str1.charAt(str1.length()-1) == str2.charAt(str2.length()-1);
	}
	static boolean func3() {
		return str1.replaceAll("[aeiou]", "").equals(str2.replaceAll("[aeiou]", ""));
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		str1 = br.readLine();
		str2 = br.readLine();
		
		System.out.println(func1() && func2() && func3() ? "YES" : "NO");
		br.close();
	}
}
