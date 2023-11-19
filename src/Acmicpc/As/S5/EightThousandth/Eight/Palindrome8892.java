package Acmicpc.As.S5.EightThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome8892 {
	static String[] arr = null;
	static boolean check(String str) {
		for (int i = 0, j = str.length()-1; i <= j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) return false;
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), k = 0;
		String res = null;
		boolean flag = false;
		
		while(T-- > 0) {
			k = Integer.parseInt(br.readLine());
			arr = new String[k];
			flag = false;
			for (int i = 0; i < k; i++) {
				arr[i] = br.readLine();
			}
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (i == j) continue;
					res = arr[i]+arr[j];
					flag = check(res);
					if (flag) break;
				}
				if (flag) break;
			}
			sb.append(flag ? res : "0").append("\n");
			
		}
		System.out.print(sb.toString());
		br.close();
	}
}
