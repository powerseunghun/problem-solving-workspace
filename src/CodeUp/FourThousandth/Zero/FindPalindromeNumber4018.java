package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindPalindromeNumber4018 {
	static boolean check(String str) {
		for (int i = 0, j = str.length()-1; i <= j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		int count = 0;
		while (!check(sb.toString())) {
			count++;
			long a = Long.parseLong(sb.toString());
			long b = Long.parseLong(sb.reverse().toString());
			sb = new StringBuilder((a+b) + "");
		}
		System.out.println(count + " " + sb.toString());
	}
}
