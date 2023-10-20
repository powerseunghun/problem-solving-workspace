package Acmicpc.As.B2.TenThousandth.One.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Strfry11328 {
	static int[] arrA = null, arrB = null;
	static boolean check(String strA, String strB) {
		arrA = new int[26];
		arrB = new int[26];
		for (int i = 0; i < strA.length(); i++) {
			arrA[strA.charAt(i)-97]++;
		}
		for (int i = 0; i < strB.length(); i++) {
			arrB[strB.charAt(i)-97]++;
		}
		for (int i = 0; i < arrA.length; i++) {
			if (arrA[i] != arrB[i]) return false;
		}
		
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String tmp = null, strA = null, strB = null;
		
		while(N-- > 0) {
			tmp = br.readLine();
			strA = tmp.split(" ")[0];
			strB = tmp.split(" ")[1];
			sb.append(check(strA, strB) ? "Possible" : "Impossible").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
