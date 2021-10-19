package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThreeSixNine {
	static int getCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
				case '3': case '6': case '9':
					count++;
					break;
			}
		}
		return count;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine()), sum = 0;
		String str = "";
		for (int i = 1; i < input; i++) {
			str = i+"";
			if (str.contains("3") || str.contains("6") || str.contains("9")) {
				sum += getCount(str);
			}
		}
		System.out.println(sum);
	}
}
