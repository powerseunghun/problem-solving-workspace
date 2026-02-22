package Acmicpc.As.B2.TenThousandth.Six.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PartialString16916 {
	private static int[] getArray(String p) {
		int[] arr = new int[p.length()];
		int j = 0;
		for (int i = 1; i < p.length(); i++) {
			while(j>0 && p.charAt(i) != p.charAt(j)) {
				j = arr[j-1];
			}
			if (p.charAt(i) == p.charAt(j)) {
				arr[i] = ++j;
			}
		}
		return arr;
	}
	public static boolean kmp(String t, String p) {
		int[] arr = getArray(p);
		int j = 0;
		
		for (int i = 0; i < t.length(); i++) {
			while(j>0 && t.charAt(i) != p.charAt(j)) {
				j = arr[j-1];
			}
			if (t.charAt(i) == p.charAt(j)) {
				if (j == p.length()-1) {
					return true;
				}
				j++;
			}
		}
		return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String P = br.readLine();
		
		System.out.println(kmp(S, P) ? 1 : 0);
		br.close();
	}
}
