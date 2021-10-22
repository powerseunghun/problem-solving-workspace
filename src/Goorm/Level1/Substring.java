package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Substring {
	static String mySubString(String str, int s, int e) {
		String res = "";
		for (int i = s-1; i < s+e-1; i++) {
			res += str.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), tmp = null;
		tmp = br.readLine();
		int s = Integer.parseInt(tmp.split(" ")[0]);
		int e = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(str.substring(s-1, s+e-1));
		System.out.println(mySubString(str, s, e));
	}
}
