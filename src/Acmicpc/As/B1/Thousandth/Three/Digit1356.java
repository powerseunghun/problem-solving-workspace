package Acmicpc.As.B1.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Digit1356 {
	static int getScore(String str) {
		int res = 1;
		for (int i = 0; i < str.length(); i++) {
			res *= str.charAt(i) - '0';
		}
		return res;
	}
	static boolean check(String str) {
		if (str.length() == 1) return false;
		int aRes = 0, bRes = 0;
		String aSub = null, bSub = null;
		
		for (int i = 0, v = 0, w = str.length(); i < str.length()-1; i++) {
			aSub = str.substring(v, v+1+i);
			bSub = str.substring(i+1, w);
			aRes = getScore(aSub);
			bRes = getScore(bSub);
			System.out.println("asub :: " + aSub + " aRes :: " + aRes);
			System.out.println("bsub :: " + bSub + " bRes :: " + bRes);
			if (aRes == bRes) return true;
		}
		return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(check(str) ? "YES" :"NO");
		br.close();
	}
}
