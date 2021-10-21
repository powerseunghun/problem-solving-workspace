package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PseudoPalindrome {
	static int checkPalindrome(String str, int diffCount) {
		int left = 0, right = 0;
		String leftDeleteStr = null, rightDeleteStr = null;
		for (int i = 0, j = str.length()-1; i <= j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				if (diffCount == 0) {
					left = i;
					right = j;
					leftDeleteStr = str.substring(0, left) + str.substring(left+1);
					rightDeleteStr = str.substring(0, right) + str.substring(right+1);
					if (checkPalindrome(leftDeleteStr, diffCount+1) == 0 
							|| checkPalindrome(rightDeleteStr, diffCount+1) == 0) {
						return 1;
					}
					else return 2;
				}
				else return 2;
			}
		}
		return 0;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			sb.append(checkPalindrome(br.readLine(), 0) + "\n");
		}
		System.out.print(sb.toString());
	}
}
