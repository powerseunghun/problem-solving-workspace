package Acmicpc.As.B1.TwentyThousandth.Seven.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrangeLongTime27962 {
	static boolean check(String sub1, String sub2) {
		int diff = 0;
		for (int i = 0; i < sub1.length(); i++) {
			if (sub1.charAt(i) != sub2.charAt(i)) diff++; 
		}
		return diff == 1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine(), sub1 = null, sub2 = null;
		boolean flag = false;
		
		for (int i = 1; i < str.length(); i++) {
			sub1 = str.substring(0, i);
			sub2 = str.substring(str.length()-i, str.length());
			
			flag = check(sub1, sub2);
			if (flag) break;
		}
		
		System.out.println(flag ? "YES" : "NO");
		br.close();
	}
}
