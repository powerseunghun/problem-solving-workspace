package Codeforce.OrderSubmit.OneThousandth.SixHundred;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Pangram {
	static Set<Character> set = new HashSet<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			char alp = str.charAt(i);
			if (alp >= 'a' && alp <= 'z') {
				alp = (char)(alp-32);
			}
			set.add(alp);
		}
		
		if (set.size() < 26) {
			System.out.println("NO");
		}
		else System.out.println("YES");
		br.close();
	}
}
