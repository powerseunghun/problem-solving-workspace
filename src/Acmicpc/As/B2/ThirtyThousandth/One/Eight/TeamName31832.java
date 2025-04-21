package Acmicpc.As.B2.ThirtyThousandth.One.Eight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TeamName31832 {
	static boolean func1(String str) {
		int l1 = str.replaceAll("[A-Z]", "").length();
		int l2 = str.replaceAll("[a-z]", "").length();
		return l1 >= l2;
	}
	static boolean func2(String str) {
		return str.length() <= 10;
	}
	static boolean func3(String str) {
		return str.replace("[0-9]", "").length() > 0;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "Aa1BbCc2";
		System.out.println(str.replaceAll("[^A-Z]", ""));
//		int N = Integer.parseInt(br.readLine());
//		String str = null, res = null;
//		
//		while(N-- > 0) {
//			str = br.readLine();
//			res = func1(str) && func2(str) && func3(str) ? str : res; 
//		}
//		
//		System.out.println(res);
		br.close();
	}
}
