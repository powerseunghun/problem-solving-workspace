package CodeUp.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseSumPalindrome1617 {
	static int getSum(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length()-1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return Integer.parseInt(str) + Integer.parseInt(sb.toString());
	}
	static boolean checkPalindrome(int n) {
		String tmp = n + "";
		for (int i = 0; i < tmp.length()/2; i++) {
			if (tmp.charAt(i) != tmp.charAt(tmp.length()-1-i)) return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		if (checkPalindrome(getSum(str))) System.out.println("YES");
		else System.out.println("NO");
	}
}
