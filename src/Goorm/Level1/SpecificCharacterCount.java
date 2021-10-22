package Goorm.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecificCharacterCount {
	static String classify(char c) {
		String res = "";
		if (c >= 'a' && c <= 'z') res = "LOWER";
		else if (c >= 'A' && c <= 'Z') res = "UPPER";
		return res;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char target = br.readLine().charAt(0);
		int[] alpha = new int[52];

		for (int i = 0, idx = 0; i < str.length(); i++) {
			if (classify(str.charAt(i)).equals("LOWER")) {
				idx = str.charAt(i) - 'a';
			}
			else if (classify(str.charAt(i)).equals("UPPER")) {
				idx = str.charAt(i) - 39;
			}
			else continue;
			alpha[idx]++;
		}
		System.out.println(classify(target).equals("LOWER") ? alpha[target-'a'] : alpha[target-39]);
	}
}
